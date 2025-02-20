package com.example.collegeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegeapp.repo.DepartmentRepository;
import com.example.collegeapp.entity.Department;

@Service
public class DepartmentService {
	@Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollege_Name(collegeName);
    }

}
