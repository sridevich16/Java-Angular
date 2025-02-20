package com.example.collegeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegeapp.entity.College;
import com.example.collegeapp.repo.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
    private CollegeRepository collegeRepository;

    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

}
