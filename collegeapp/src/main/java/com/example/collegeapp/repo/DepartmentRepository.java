package com.example.collegeapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeapp.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
	List<Department> findByCollege_Name(String collegeName);

}
