package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// TOPIC = batch updation
// grouping multiple SQL operations and executing them together using addBatch() and executeBatch()
// use statement and execute batch method


public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
//      create statement
        Statement st=con.createStatement();
        st.addBatch("insert into student values(20,'ram',102)");
        st.addBatch("insert into student values(21,'syamm',103)");
        st.addBatch("insert into student values(222,'dewa',104)");
        
        int[] count=st.executeBatch();
        for(int i:count) {
        	System.out.println(i + "success");
        }
        
    }
}