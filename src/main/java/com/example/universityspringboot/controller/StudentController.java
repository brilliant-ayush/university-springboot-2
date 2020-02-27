package com.example.universityspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.universityspringboot.model.Department;
import com.example.universityspringboot.model.Student;
import com.example.universityspringboot.service.StudentService;



public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/departments/{departmentId}/students")
	public void addSubject(@RequestBody Student student, @PathVariable long departmentId) {
		student.setDepartment(new Department(departmentId, ""));
		studentService.addStudent(student);
	}
	
	@RequestMapping("/departments/{departmentId}/subjects")
	public List<Student> getAllSubjects(@PathVariable long departmentId){
		return studentService.getAllStudents(departmentId);
	}

}
