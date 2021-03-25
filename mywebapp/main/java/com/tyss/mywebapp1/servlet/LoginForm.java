package com.tyss.mywebapp1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList al = new ArrayList();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		if((name==null) || (name.equals(""))){
			al.add("add names to list");
		}
		if((password==null) || (name.equals(""))){
			al.add("password to list");
		}
		if(al.size()!=0) {
			out.println(al);
			
		}else {
			 Connection conn=null;
			   PreparedStatement stmt=null;
			try {
				Class.forName("com.mysql.jdbc.driver");
				
				String dbURL = "jdbc:mysql://localhost:3306/"+"employee?autoReconnect=true&useSSL=false&user=root&password=root";
				conn =DriverManager.getConnection(dbURL);
               String query = " insert into Login values(?,?);";
				
				stmt= conn.prepareStatement(query);
				 stmt.setString(1,name);
				 stmt.setString(2, password);
				 
				 int rs= stmt.executeUpdate();
					
				
					if(rs!=0 ) {
						System.out.println("Record inserted "+rs);
					}else {
						System.out.println("Record Not inserted "+rs);}
					conn.close();

				
			}catch(Exception e) {
				 resp.sendError(503, "PROBLEM IN DATABASE...");
			}
		}

	}
	 public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        doGet(req, res);
	    }

}
