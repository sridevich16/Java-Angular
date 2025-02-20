package com.wipro.Transaction_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Transaction_service.entity.Transaction;
import com.wipro.Transaction_service.repo.TransactionRepository;
@Service
public class Transactionservice {
	 @Autowired
	    private TransactionRepository transactionRepository;

	    public Long createTransaction(Transaction transaction) {
	    	Transaction savedTransaction = transactionRepository.save(transaction);
	        return savedTransaction.getId();
	    }
	    public List<Transaction> getTransactionsBySavingId(Long sid) {
	        return transactionRepository.findBySid(sid);
	    }
	    }