package com.example.universityspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.universityspringboot.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
	
	public List<Subject> findByDepartmentId(long departmentId); 

}
