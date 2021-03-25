package com.tyss.designpattern.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class CrudOperation {

		
			// TODO Auto-generated method stub
			 public EmployeePrimaryInfo getDetailsByEmployeeID(int id){
		    Connection conn=null;
		    PreparedStatement stmt = null;
		    ResultSet rs=null;
		    
		try {
			
			
			//1.load the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			//2. Get the "DB Connection via "driver"
			String dbURL = "jdbc:mysql://localhost:3306/"+"employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn =DriverManager.getConnection(dbURL);
			
			
			//3. Issue "SQL Queries " via "Connection"
			String query ="select * from employee_info where emp_id=?.";
			//stmt =conn.createStatement();
			stmt=conn.prepareStatement(query);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			EmployeePrimaryInfo record= new EmployeePrimaryInfo();
			
			//4. "Process the Results" returned by sql query
			 if(rs.next()) {
				 record.setEmp_id(rs.getInt("emp_id"));
				 record.setName(rs.getString("name"));
				 record.setDept_id(rs.getInt("dept_id"));
				 record.setDesignation(rs.getString("designation"));
				 record.setDate_of_join(rs.getDate("date_of_join"));
				 record.setEmail(rs.getString("email"));
				 record.setAge(rs.getInt("age"));
				 
		    	 return record;
		      }else {
		    	 return null;
		      }
			
		      
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//5.close all the jdbc objects
			try {
				if(conn!=null) {
					conn.close();
				
			}//end of block
				if(stmt!=null) {
					stmt.close();
				
			}
				if(rs!=null) {
					rs.close();
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		return null;
			 }

	}

	


