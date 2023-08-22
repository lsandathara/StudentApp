package com.springboot.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentsystem.model.Student;
import com.springboot.studentsystem.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired StudentRepo studentrepo;

	@Override
	public Student InsertStudentData(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public List<Student> ListStudent() {
		// TODO Auto-generated method stub
		
		
		return studentrepo.findAll();
	}
}
