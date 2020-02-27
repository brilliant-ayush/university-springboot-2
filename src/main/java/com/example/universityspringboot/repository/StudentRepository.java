package com.example.universityspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.universityspringboot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	
	public List<Student> findByDepartmentId(long departmentId); 

}
