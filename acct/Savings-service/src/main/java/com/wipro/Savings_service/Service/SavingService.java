package com.wipro.Savings_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.wipro.Savings_service.Entity.Saving;
import com.wipro.Savings_service.dto.*;
//import com.wipro.Savings_service.Entity.Transaction;
import com.wipro.Savings_service.repo.SavingRepository;
//import com.wipro.Savings_service.repo.TransactionRepository;

//import jakarta.transaction.Transactional;
@Service
public class SavingService {
	@Autowired
    private SavingRepository repository;

    @Autowired
    private WebClient.Builder webClientBuilder;
    
    
    

    
    public Saving createSaving(Saving saving) {
        WebClient webClient = webClientBuilder.build();

        // Deduct balance and record transaction in Account Service
        accountdto account=webClient.get()
                .uri("http://localhost:9097/accounts/" + saving.getAccountNum())
                .retrieve()
                .bodyToMono(accountdto.class)
                .block();
        

        // Check if balance is sufficient
        if (account.getBalance() < saving.getAmountInvested()) {
            throw new RuntimeException("Insufficient balance for savings investment");
        }

        // Deduct balance
        double newBalance = account.getBalance() - saving.getAmountInvested();

        webClientBuilder.build()
        .put()
        .uri("http://localhost:9097/accounts/update-balance/" + saving.getAccountNum() + "/" + newBalance)
        .retrieve()
        .bodyToMono(Void.class)
        .block();

        // Save the saving investment
        Saving savedSaving = repository.save(saving);
        
        Transactiondto transactionDTO = new Transactiondto(null, savedSaving.getSid(), "Debited", savedSaving.getAmountInvested(), savedSaving.getAccountNum());

        Long transactionId = webClientBuilder.build()
                .post()
                .uri("http://localhost:9099/transactions/create")
                .bodyValue(transactionDTO)
                .retrieve()
                .bodyToMono(Long.class)
                .block();

        // Step 6: Update Saving record with Transaction ID
        savedSaving.setTransactionId(transactionId);
        return repository.save(savedSaving);

           }
        
    

}
