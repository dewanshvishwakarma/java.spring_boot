package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.beans.Items;

public class itemRowMapper implements RowMapper<Items>{

	@Override
	public Items mapRow(ResultSet rs, int rowNum) throws SQLException {
		 String item_id1=rs.getString("id");
		 String item_name1=rs.getString("name");
		 String item_price1=rs.getString("price");
		
		 Items item=new Items();
		 item.setId(item_id1);
		 item.setName(item_name1);
		 item.setPrice(item_price1);
		 
		 return item;
		  
	}
	

}
