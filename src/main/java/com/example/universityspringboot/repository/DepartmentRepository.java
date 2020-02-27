package com.example.universityspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.universityspringboot.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
