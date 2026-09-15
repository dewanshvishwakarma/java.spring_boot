package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class InsertDemo {
	@Autowired
	JdbcTemplate jdbc;
	
	public void operation() {
		int id=10;
		String name="aditya";
		int Age=100;
		
		String q="insert into student values(?,?,?)";
		int count =jdbc.update(q,id,name,Age);
		if(count>0) {
			System.out.println("insertion done");
		}else {
			System.out.println("gai bhes pani mai");
		}
	}

}
