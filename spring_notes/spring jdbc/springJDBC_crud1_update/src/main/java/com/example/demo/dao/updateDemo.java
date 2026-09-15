package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class updateDemo {
	@Autowired
	JdbcTemplate jdbc;
	
	public void operation() {
		int id=10;
		String name="pagal";
		String q="update student set name=? where id=?";
		int count =jdbc.update(q,name,id);
		if(count>0) {
			System.out.println("updation  done");
		}else {
			System.out.println("gai bhes pani mai");
		}
	}

}
