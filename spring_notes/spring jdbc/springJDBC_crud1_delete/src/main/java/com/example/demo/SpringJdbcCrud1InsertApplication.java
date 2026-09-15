package com.example.demo;

import com.example.demo.dao.deleteDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcCrud1InsertApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcCrud1InsertApplication.class, args);
		deleteDemo d=context.getBean(deleteDemo.class);
		d.operation();
		
	}

}
