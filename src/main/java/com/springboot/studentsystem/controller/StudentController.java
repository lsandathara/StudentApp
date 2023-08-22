package com.springboot.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studentsystem.model.Student;
import com.springboot.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentservice.InsertStudentData(student);
		return "New stduent added";
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return studentservice.ListStudent();
	}
}
