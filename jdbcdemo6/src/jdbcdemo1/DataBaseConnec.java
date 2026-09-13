package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// TOPIC = batch updation
// grouping multiple SQL operations and executing them together using addBatch() and executeBatch()
// use preparedStatement and execute batch method


public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
//      create preparedStatement
        PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
        ps.setInt(1,101);
        ps.setString( 2,"abhinav");
        ps.setInt(3,500);
        ps.addBatch();//batch 1
        
        
        ps.setInt(1,102);
        ps.setString( 2,"abhy");
        ps.setInt(3,50);
        ps.addBatch();//batch2
        
        ps.setInt(1,104);
        ps.setString( 2,"arnav");
        ps.setInt(3,1000);
        ps.addBatch();//batch3
        
        int[] count=ps.executeBatch();
        for(int i:count) {
        	System.out.println("succsess");
        }
             
    }
}