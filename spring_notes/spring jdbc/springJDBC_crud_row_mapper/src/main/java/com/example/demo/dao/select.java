package com.example.demo.dao;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.itemRowMapper;

@Repository
public class select {
	@Autowired
	private JdbcTemplate jdbc;
	
	public void selectOperation() {
		String q="select * from Items";
		List<Items> l=jdbc.query(q, new itemRowMapper());
		System.out.println(l);
	}
	

}
