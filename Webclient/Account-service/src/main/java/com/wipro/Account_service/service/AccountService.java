package com.wipro.Account_service.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Account_service.entity.Account;

import com.wipro.Account_service.repo.AccountRepository;

@Service
public class AccountService {
	@Autowired
    private AccountRepository accountRepository;
	public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccount(Long actNum) {
        return accountRepository.findById(actNum)
            .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public Account updateBalance(Long actNum, Double newBalance) {
        Account account = accountRepository.findById(actNum)
            .orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(newBalance);
        return accountRepository.save(account);
    }

        
  
	
}


