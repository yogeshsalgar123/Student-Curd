package com.restapi.student.StudentCurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.student.StudentCurd.entity.Student;
import com.restapi.student.StudentCurd.service.Student_Service;

@RestController
@RequestMapping("/api")
public class Student_Controller {
	
	@Autowired
	Student_Service serv;

	@GetMapping("/searchstudent")
	public List<Student> searchStudent()
	{
		return serv.getStudent();
	}
	
	@PostMapping("/addstudents")
	public String addStudents(@RequestBody Student std)
	{
		return serv.addstudent(std);
	}
	
	@PutMapping("/updatestudent")
	public String updateStudent(@RequestBody Student std)
	{
		return serv.update(std);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable long id)
	{
		return serv.deleteById(id);
		
	}
}
