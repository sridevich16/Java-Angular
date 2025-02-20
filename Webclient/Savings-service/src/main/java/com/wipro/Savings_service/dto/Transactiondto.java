package com.wipro.Savings_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transactiondto {
	private Long id;

    private Long sid; // Saving ID (Foreign Key)
    private String status; // Credited or Debited
    private double amount;
    private Long accountNum;
    
    
	public Transactiondto(Long id, Long sid, String status, double amount, Long accountNum) {
		super();
		this.id = id;
		this.sid = sid;
		this.status = status;
		this.amount = amount;
		this.accountNum = accountNum;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	} 
	

}
