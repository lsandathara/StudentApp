package com.springboot.studentsystem.service;
import java.util.List;

import com.springboot.studentsystem.model.Student;
public interface StudentService {
	public Student InsertStudentData(Student student);
	public List<Student> ListStudent();

}



