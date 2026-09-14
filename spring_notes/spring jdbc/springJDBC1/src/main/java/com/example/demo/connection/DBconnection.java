package com.example.demo.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DBconnection {
	@Autowired
	private DataSource dataSource;
	
	
	public void checkConnection() throws SQLException {
		Connection con=dataSource.getConnection();
		if(con!=null) {
			System.out.println("done raja bhaiya");
		}else {
			System.out.println("tumse nahi ho paeega ");
		}
		
		
//		System.out.println("connection done re baba");
	}

}
