package com.tyss.jdbcapp.statement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFetchRecord {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		    Connection conn=null;
		    Statement stmt=null;
		    ResultSet rs=null;
		    
		try {
			
			
			//1.load the driver
			Driver driver=new Driver();
			
			DriverManager.registerDriver(driver);
			//2. Get the "DB Connection via "driver"
			
			String dbURL = "jdbc:mysql://localhost:3306/"+"employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn =DriverManager.getConnection(dbURL);	
			//3. Issue "SQL Queries " via "Connection"
			String query ="select * from emp_table";
			stmt =conn.createStatement();
			rs = stmt.executeQuery(query);
			
			//4. "Process the Results" returned by sql query
			 while(rs.next()) {
		    	  int empno = rs.getInt("id");
		    	  String ename = rs.getString("name");
		    	  int sal = rs.getInt("salary");
		    	  System.out.println("*********");
		    	  System.out.println("ID" +empno);
		    	  System.out.println("NAME" +ename);
		    	  System.out.println("DEPARTMENT" +sal);
		    	  System.out.println("*********");
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

	}

}
