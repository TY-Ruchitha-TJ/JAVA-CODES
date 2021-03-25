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

public class MyUpdateStatement {
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
			//conn =DriverManager.getConnection(dbURL);	//abstraction,encapsulation,inheritance,polymorphism
			conn =DriverManager.getConnection(dbURL,pro);
			//3. Issue "SQL Queries " via "Connection"
			String query = "update emp_info set id=? where name='ruchitha'";
			//stmt =conn.createStatement();
			stmt=conn.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
		    int result = stmt.executeUpdate();
		    
			
			//4. "Process the Results" returned by sql query
		    if(result!=0 ) {
				System.out.println("Record updated "+result);
			}else {
				System.out.println("Record Not updated "+result);
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
