package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.serviceImplementation;

@SpringBootApplication
public class DataJpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(DataJpaCrudApplication.class, args);
		StudentService stdService=context.getBean(serviceImplementation.class);
//		insertion
//		Student s2=new Student();
//		s2.setId(3);
//		s2.setName("arnav");
//		s2.setMarks(40);
//	boolean status=	stdService.addStudent(s2);
//	if(status) {
//		System.out.println("done ");
//	}else {
//		System.out.println("fail");
//	}
	
//	Student s2=stdService.getStudentById(2);
//	System.out.println(s2.getId());
//	System.out.println(s2.getName());
//	System.out.println(s2.getMarks());
	
		
		//get by id
//	Student std	=  stdService.getStudentById(1);
//	if(std!=null) {
//		System.out.println(std.getId());
//		System.out.println(std.getName());
//	}else {
//		System.out.println("data getted");
//	}
		
//		findall
		
//		List<Student> std=stdService.getAllStudent();
//		for(Student i:std) {
//			System.out.println(i.getName());
//			System.out.println("..................");
//		}
	
	
//	boolean status=	stdService.updateStudentDetails(1, 200);
//	if(status) {
//		System.out.println("done ");
//	}else {
//		System.out.println("fail");
//	}
	
	
	
	boolean status=	stdService.deleteStudentById(3);
	if(status) {
		System.out.println("done ");
	}else {
		System.out.println("fail");
	}
	
	}

}
