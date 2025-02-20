package com.example.collegeapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeapp.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
	List<Faculty> findByDepartment_Name(String departmentName);

}
