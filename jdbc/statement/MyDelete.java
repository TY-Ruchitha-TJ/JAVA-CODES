package com.tyss.jdbcapp.statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyDelete {
	public static void main(String[] args) throws Throwable {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		FileInputStream inStream = new FileInputStream ("test.properties");
		Properties pro=new Properties();
		pro.load(inStream);
		
		
		 try {
			 //1.Load the Driver
			 Driver driver= new Driver();
			 
			 DriverManager.registerDriver(driver);
			 
			 // 2.Get the "DB Connection via "Driver"
			 String dbURL = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";
			
			 conn = DriverManager.getConnection(dbURL, pro);
			 
			  
		
			  //3.Issue "SQL Queries" via "Connection"
			 String query = "delete from emp_info where id=104";
			 stmt =  conn.createStatement();
			 int rowAffected = stmt.executeUpdate(query);
			 
			 
			 //4."Process The Results" returned by "SQl queries"
			 
			 if(rowAffected!=0) {
					System.out.println("record Deleted"+rowAffected );
				}else {
					System.out.println("record not Deleted"+rowAffected );
				}
			
			 
			 } catch (SQLException e) {
				e.printStackTrace ();
			 }finally {
				 try {
					 if(conn != null) {
						 conn.close();
					 }//End of if block
					 if(stmt != null) {
						 stmt.close();
					 }//End of If Block
					 if(rs != null) {
						 rs.close();
					 }//End of If Block
				 } catch(SQLException e) {
					 e.printStackTrace();
				 }//End of the inner catch block
			 }
	}

}
