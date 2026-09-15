package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class deleteDemo {
	@Autowired
	JdbcTemplate jdbc;
	
	public void operation() {
		int id=10;
//		String name="pagal";
		String q="delete from student where id=?";
		int count =jdbc.update(q,id);
		if(count>0) {
			System.out.println("deletion  done");
		}else {
			System.out.println("gai bhes pani mai");
		}
	}

}
