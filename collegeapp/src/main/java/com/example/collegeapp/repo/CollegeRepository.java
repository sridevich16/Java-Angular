package com.example.collegeapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeapp.entity.College;
public interface CollegeRepository extends JpaRepository<College, Long>{
	College findByName(String name);

}
