package com.example.universityspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.universityspringboot.model.Department;
import com.example.universityspringboot.model.Subject;
import com.example.universityspringboot.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/departments/{departmentId}/subjects")
	public void addSubject(@RequestBody Subject subject, @PathVariable long departmentId) {
		subject.setDepartment(new Department(departmentId, ""));
		subjectService.addSubject(subject);
	}
	
	@RequestMapping("/departments/{departmentId}/subjects")
	public List<Subject> getAllSubjects(@PathVariable long departmentId){
		return subjectService.getAllSubjects(departmentId);
	}

}
