package com.tyss.jdbcapp.preparestatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFetchPrepare {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		    Connection conn=null;
		    PreparedStatement stmt=null;
		    ResultSet rs=null;
		    
		try {
			FileInputStream instream=	new FileInputStream("test.properties");
			Properties pro = new Properties();
			pro.load(instream);
			
			//1.load the driver
			Driver driver=new Driver();
			
			DriverManager.registerDriver(driver);
			//2. Get the "DB Connection via "driver"
			
			String dbURL = "jdbc:mysql://localhost:3306/"+"employee?autoReconnect=true&useSSL=false";
			conn =DriverManager.getConnection(dbURL,pro);
			//3. Issue "SQL Queries " via "Connection"
			String query = "select * from emp_info ";//and deptno=?";
			//stmt =conn.createStatement();
			stmt=conn.prepareStatement(query);
			stmt.setString(1,(args[0]));
		    rs = stmt.executeQuery();
		    
			
			//4. "Process the Results" returned by sql query
		    
		    
			while(rs.next()) {
		    	  int empno = rs.getInt("id");
		    	  String ename = rs.getString("name");
		    	  int sal = rs.getInt("salary");
		    	  System.out.println("*********");
		    	  System.out.println("ID" +empno);
		    	  System.out.println("NAME" +ename);
		    	  System.out.println("SALARY" +sal);
		    	  System.out.println("*********");
		      } //END
		      
			
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
