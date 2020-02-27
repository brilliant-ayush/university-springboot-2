package com.example.universityspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universityspringboot.model.Student;
import com.example.universityspringboot.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student>getAllStudents(long departmentId){
		List<Student> subjects = new ArrayList<>();
		studentRepository.findByDepartmentId(departmentId)
		.forEach(subjects::add);
		return subjects;
	}

}
