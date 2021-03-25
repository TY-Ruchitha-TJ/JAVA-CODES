package com.tyss.inheritance.defaults;

public class Test {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.pid =111;//person
	employee.name ="ruchi";//person
	employee.email="ruchi@gmail.com";//Employee
	employee.address();//person
	employee.designation();//Employee
	System.out.println("employee pid"+employee.pid); 
	System.out.println("employee name"+employee.name);
	System.out.println("employee pid"+employee.email);
	
}
}
