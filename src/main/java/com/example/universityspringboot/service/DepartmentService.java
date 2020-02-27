package com.example.universityspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universityspringboot.model.Department;
import com.example.universityspringboot.repository.DepartmentRepository;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}

	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<>();
		departmentRepository.findAll()
		.forEach(departments::add);
		return departments;
		
	}

}
