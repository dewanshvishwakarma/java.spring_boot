package com.example.demo;

import com.example.demo.dao.InsertDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcCrud1InsertApplication {

	private final InsertDemo insertDemo;

	SpringJdbcCrud1InsertApplication(InsertDemo insertDemo) {
		this.insertDemo = insertDemo;
	}

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcCrud1InsertApplication.class, args);
		InsertDemo d=context.getBean(InsertDemo.class);
		d.operation();
		
	}

}
