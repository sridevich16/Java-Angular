package com.example.collegeapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeapp.service.DepartmentService;
import com.example.collegeapp.entity.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;

    @GetMapping("/{collegeName}")
    public List<Department> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        return departmentService.getDepartmentsByCollegeName(collegeName);
    }

}
