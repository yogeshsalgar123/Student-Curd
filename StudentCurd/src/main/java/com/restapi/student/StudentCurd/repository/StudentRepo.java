package com.restapi.student.StudentCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.restapi.student.StudentCurd.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student, Long>{

	void deleteByfirstname(String firstname);


}
