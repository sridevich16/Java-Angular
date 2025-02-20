package com.wipro.Savings_service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class accountdto {
	private Long actNum;
	private String name;
    private String ifscCode;
    private String branch;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	private double balance;

    // Getters and Setters
    public Long getActNum() {
        return actNum;
    }

    public void setActNum(Long actNum) {
        this.actNum = actNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
