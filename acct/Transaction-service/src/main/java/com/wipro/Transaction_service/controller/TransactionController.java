package com.wipro.Transaction_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Transaction_service.service.*;
import com.wipro.Transaction_service.entity.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	 @Autowired
	    private Transactionservice transactionService;
	 @PostMapping("/create")
	    public ResponseEntity<Long> createTransaction(@RequestBody Transaction transaction) {
	        Long transactionId = transactionService.createTransaction(transaction);
	        return ResponseEntity.status(HttpStatus.CREATED).body(transactionId);
	    }
	 @GetMapping("/saving/{sid}")
	    public ResponseEntity<List<Transaction>> getTransactionsBySavingId(@PathVariable Long sid) {
	        List<Transaction> transactions = transactionService.getTransactionsBySavingId(sid);
	        return ResponseEntity.ok(transactions);
	    }
	    
}
