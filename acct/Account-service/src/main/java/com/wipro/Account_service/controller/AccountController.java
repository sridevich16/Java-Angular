package com.wipro.Account_service.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Account_service.entity.Account;
import com.wipro.Account_service.repo.AccountRepository;
import com.wipro.Account_service.service.AccountService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountService accountService;
	
	@PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account savedAccount = accountRepository.save(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAccount);
    }

    // 2️⃣ Get Account Details
    @GetMapping("/{actNum}")
    public ResponseEntity<Account> getAccount(@PathVariable Long actNum) {
        Account account = accountRepository.findById(actNum)
            .orElseThrow(() -> new RuntimeException("Account not found"));
        return ResponseEntity.ok(account);
    }

    // 3️⃣ Update Balance (Called by Saving Service)
    @PutMapping("/updateBalance/{actNum}/{newBalance}")
    public ResponseEntity<Account> updateBalance(@PathVariable Long accountNum, 
            @PathVariable double newBalance) {
Account updatedAccount = accountService.updateBalance(accountNum, newBalance);
return ResponseEntity.ok(updatedAccount);
}
    
	

}
