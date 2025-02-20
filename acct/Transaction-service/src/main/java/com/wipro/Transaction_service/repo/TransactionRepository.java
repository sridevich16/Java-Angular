package com.wipro.Transaction_service.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Transaction_service.entity.*;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	

	List<Transaction> findBySid(Long sid);
}
