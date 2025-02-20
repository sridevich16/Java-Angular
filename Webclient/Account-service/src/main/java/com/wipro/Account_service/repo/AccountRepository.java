package com.wipro.Account_service.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Account_service.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
