package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.Student;

public interface StudentService  {

	public boolean addStudent(Student std); 
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public boolean updateStudentDetails(int id,int masrks);
	public boolean deleteStudentById(int id);
}
