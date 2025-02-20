package com.example.collegeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegeapp.repo.FacultyRepository;
//import com.example.collegeapp.entity.Faculty;

@Service
public class FacultyService {
	 @Autowired
	    private FacultyRepository facultyRepository;

	    public List<com.example.collegeapp.entity.Faculty> getFacultiesByDepartmentName(String departmentName) {
	        return facultyRepository.findByDepartment_Name(departmentName);
	    }

}
