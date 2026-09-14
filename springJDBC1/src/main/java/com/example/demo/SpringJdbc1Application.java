package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.connection.DBconnection;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) throws SQLException {
	 ApplicationContext context=	SpringApplication.run(SpringJdbc1Application.class, args);
	 DBconnection c=context.getBean(DBconnection.class);
	 c.checkConnection();
	}

}
