package com.tyss.jdbcapp.preparestatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyDeleteStatement {
	public static void main(String[] args) throws Exception {
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs = null;
		
		try {
			//1.Load the Driver
			Properties pro = new Properties();
			FileInputStream file = new FileInputStream("test.properties");
			pro.load(file);
			Driver driver = new Driver();

			DriverManager.registerDriver(driver);
			
	        //2.get "DB Connection" via Driver
			String dbURL ="jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";

			conn= DriverManager.getConnection(dbURL,pro);

			//3.Issue SQL queries via "connection"
			String query = "delete from emp_info where id=?";
			stmt =  conn.prepareStatement(query);
			
	        stmt.setInt(1,Integer.parseInt(args[0]));
	
			int rs1 = stmt.executeUpdate();
			
			//4.Process the results "returned by SQL queries"
			if(rs1!=0) {
				System.out.println("Record deleted "+rs1);
			}else {
				System.out.println("Record Not deleted "+rs1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//5.close all the JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	private static Properties loadPropertiesFile() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
