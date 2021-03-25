package com.tyss.jdbcapp.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;


public class MyFirstJDBCProgram {
	
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
			 // 1st type method overload  conn =  DriverManager.getConnection(dbURL);
			 //2nd type method overload
			 conn = DriverManager.getConnection(dbURL, pro);
			 
			  
		
			  //3.Issue "SQL Queries" via "Connection"
			 String query = "Select * from employee_info";
			 stmt =  conn.createStatement();
			 rs = stmt.executeQuery(query);
			 //4."Process The Results" returned by "SQl queries"
			 while(rs.next()) {
				 int empId =rs.getInt("emp_id");
				 String name = rs.getString("name");
				 int departmentId = rs.getInt("dept_id");
				 System.out.println("===================================");
				 System.out.println("emp_id "+ empId);
				 System.out.println("EmployeeName "+name);
				 System.out.println("departmentId "
				 		+ ""+departmentId);
				 System.out.println("***************************************");
			 }//End of the While Loop
			 
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
