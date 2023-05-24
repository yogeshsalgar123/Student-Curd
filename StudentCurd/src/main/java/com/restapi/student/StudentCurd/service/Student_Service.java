package com.restapi.student.StudentCurd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.student.StudentCurd.entity.Student;
import com.restapi.student.StudentCurd.repository.StudentRepo;

@Service
public class Student_Service {
	@Autowired
	StudentRepo repo;
	
	public String addstudent(Student std)
	{
		repo.save(std);
		return "Student Added Successfully !!!";
	}

	public List<Student> getStudent() {
		return repo.findAll();
		
	}

	public String update(Student std) {
		repo.deleteByfirstname(std.getFirstname());
		repo.save(std);
		return "Student updated Succesufully!!!";
	}

	public String deleteById(long id) {
		repo.deleteById(id);
		return "Student deleted Succesufully!!!";
	}



	
}
