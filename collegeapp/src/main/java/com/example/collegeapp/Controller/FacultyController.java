package com.example.collegeapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeapp.entity.Faculty;
import com.example.collegeapp.service.FacultyService;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {
	@Autowired
    private FacultyService facultyService;

    @GetMapping("/{departmentName}")
    public List<Faculty> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        return facultyService.getFacultiesByDepartmentName(departmentName);
    }

}
