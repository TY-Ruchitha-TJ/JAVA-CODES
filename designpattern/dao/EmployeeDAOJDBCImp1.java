package com.tyss.designpattern.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.jdbc.Driver;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeDAOJDBCImp1 implements EmployeeDAO {

	public EmployeePrimaryInfo getDetailsByEmployeeID(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {

			// 1.load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// 2. Get the "DB Connection via "driver"
			String dbURL = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn = DriverManager.getConnection(dbURL);

			// 3. Issue "SQL Queries " via "Connection"
			String query = "select * from employee_info where emp_id=?.";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			EmployeePrimaryInfo record = new EmployeePrimaryInfo();

			// 4. "Process the Results" returned by sql query
			if (rs.next()) {
				record.setEmp_id(rs.getInt("emp_id"));
				record.setName(rs.getString("name"));
				record.setDept_id(rs.getInt("dept_id"));
				record.setDesignation(rs.getString("designation"));
				record.setDate_of_join(rs.getDate("date_of_join"));
				record.setEmail(rs.getString("email"));
				record.setAge(rs.getInt("age"));

				return record;
			} else {
				return null;
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 5.close all the jdbc objects
			try {
				if (conn != null) {
					conn.close();

				} // end of block
				if (stmt != null) {
					stmt.close();

				}
				if (rs != null) {
					rs.close();

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean deleteByEmployeeId(int Emp_id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the Driver

			Driver driver = new Driver();
            DriverManager.registerDriver(driver);

			// 2.get "DB Connection" via Driver
			String dbURL = "jdbc:mysql://localhost:330/employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn = DriverManager.getConnection(dbURL);

			// 3.Issue SQL queries via "connection"
			String query = "delete from employee_info where Emp_id=?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, Emp_id);
			int rs1 = stmt.executeUpdate();

			// 4.Process the results "returned by SQL queries"
			if (rs1 != 0) {
				System.out.println("Record deleted " + rs1);
			} else {
				System.out.println("Record Not deleted " + rs1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5.close all the JDBC objects
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the Driver
			Driver driver = new Driver();
            DriverManager.registerDriver(driver);

			// 2.Get the "DB Connection via "Driver"
			String dbURL = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn = DriverManager.getConnection(dbURL);

			// 3.Issue "SQL Queries" via "Connection"
			String query = "insert into employee_info values(?,'sanvitha','sanu12@g.com',9986896754,'Developer','2019-09-08',15000,'1998-08-06','A+',21,9,199854897623,'female','single',1)";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, info.getEmp_id());
			int rowAffected = stmt.executeUpdate();

			// 4."Process The Results" returned by "SQl queries"
			if (rowAffected != 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				} // End of if block
				if (stmt != null) {
					stmt.close();
				} // End of If Block
				if (rs != null) {
					rs.close();
				} // End of If Block
			} catch (SQLException e) {
				e.printStackTrace();
			} // End of the inner catch block
		}

	}

	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		boolean status=false;

		PreparedStatement stmt=null;
		Connection con=null;
		ResultSet rs=null;


		try {

			// 1. load the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			//2.get the db connection via the driver

			String dbURL = "jdbc:mysql://localhost:3306/"+"employee?autoReconnect=true&useSSL=false&user=root&password=root";
			con=DriverManager.getConnection(dbURL);

			//3. issue the sql query via connection

			String query="update employee_info set  emp_id=? where name='varun'";
			stmt= con.prepareStatement(query);
			stmt.setInt(1, info.getEmp_id());
			int result = stmt.executeUpdate();

			// 4.Process the results returned by "SQL Queries"
			if (result!= 0) {
				status = true;
			} else {
				status = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// 5. Close all the JDBC object
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} // End of Inner try-catch block

		} // End of Outer try-catch-finally block

		return status;
	}
	

	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		List<EmployeePrimaryInfo> emp =new ArrayList<EmployeePrimaryInfo>();
	
		   Connection conn=null;
		    Statement stmt=null;
		    ResultSet rs=null;
		    
		try {
			//1.load the driver
			Driver driver=new Driver();
		    DriverManager.registerDriver(driver);
		    
			//2. Get the "DB Connection via "driver"
			String dbURL = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false&user=root&password=root";
			conn = DriverManager.getConnection(dbURL);

			//3. Issue "SQL Queries " via "Connection"
			String query = "select * from employee_info ";
			stmt=conn.createStatement();
		    rs = stmt.executeQuery(query);
		    
			
			//4. "Process the Results" returned by sql query
		    EmployeePrimaryInfo em = new EmployeePrimaryInfo();
		    
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
		return null;

	}

}
