package com.wipro.Savings_service.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Savings_service.Entity.Saving;

import com.wipro.Savings_service.Service.SavingService;
//import com.wipro.Savings_service.repo.TransactionRepository;

@RestController
@RequestMapping
public class SavingController {
	@Autowired
    private SavingService savingService;
	 @PostMapping("/invest")
	    public ResponseEntity<Saving> investInSaving(@RequestBody Saving saving) {
	        Saving savedInvestment = savingService.createSaving(saving);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedInvestment);
	    }
	
	
    
}
