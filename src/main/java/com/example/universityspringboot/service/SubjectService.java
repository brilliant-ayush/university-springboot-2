package com.example.universityspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universityspringboot.model.Department;
import com.example.universityspringboot.model.Subject;
import com.example.universityspringboot.repository.SubjectRepository;


@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}
	
	public List<Subject>getAllSubjects(long departmentId){
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findByDepartmentId(departmentId)
		.forEach(subjects::add);
		return subjects;
	}

}
