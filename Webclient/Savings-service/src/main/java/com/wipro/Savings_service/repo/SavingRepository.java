package com.wipro.Savings_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Savings_service.Entity.Saving;

public interface SavingRepository extends JpaRepository<Saving,Long>{
	List<Saving> findByAccountNum(Long accountNum);

}
