 package com.tyss.mywebapp1.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/date")

public class MyFirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date dateref = new Date();
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Current Date and Time is :- "+dateref+"</h1>");
		out.println("</body>");
		out.println("</html>");
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
	
	}//End of the doget method
	

}// end of class
