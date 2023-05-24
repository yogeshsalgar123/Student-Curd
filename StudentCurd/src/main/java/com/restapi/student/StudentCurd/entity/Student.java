package com.restapi.student.StudentCurd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private long id;
	@Column(name="first_Name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	private String Email;
	@Column(name="student_Grade")
	private String grade;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int id, String firstname, String lastname, String email, String grade) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		Email = email;
		this.grade = grade;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
		
}
