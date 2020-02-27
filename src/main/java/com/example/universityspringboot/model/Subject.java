package com.example.universityspringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subjectId;
	private String subjectName;
	
	@ManyToOne
	private Department department;

	public Subject() {
		
	}
	
	public Subject(long subjectId, String subjectName, long departmentId) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.department = new Department(departmentId, "");
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
