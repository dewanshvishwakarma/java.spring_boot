package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class serviceImplementation implements StudentService{
	@Autowired
	private StudentRepo sr;
	@Override
	public boolean addStudent(Student std) {
		try {
			sr.save(std);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public Student getStudentById(int id) {
		
		
			Optional<Student> op =sr.findById(id); 
			if(op.isPresent()) {
				return op.get();
			}
			else {
				return null;
			}
		 
	}
	
	@Override
	public List<Student> getAllStudent() {
		return sr.findAll();
		 
	}
	
	@Override
	public boolean updateStudentDetails(int id, int masrks) {
		 try {
			 Optional< Student> op=sr.findById( id);
			Student std= op.get();
			std.setMarks(masrks);
			sr.save(std);
			return true;
		 }catch(Exception e){
			 System.out.println("fail chacha");
			 return false;
		 }
	}
	
	@Override
	public boolean deleteStudentById(int id) {
		 sr.deleteById(id);
		 return true;
	}
	

}
