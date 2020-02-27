package com.example.universityspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.universityspringboot.model.Department;
import com.example.universityspringboot.service.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
    @RequestMapping(method = RequestMethod.POST, value = "/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}
    
    @RequestMapping("/departments")
    public List<Department> getAllDepartments(){
    	return departmentService.getAllDepartments();
    }
	
}
