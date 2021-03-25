package com.tyss.designpattern.services;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class Fetch {
	public static void main(String[] args) {
		 
		CrudOperation operation = new CrudOperation();
		EmployeePrimaryInfo empInfo=operation.getDetailsByEmployeeID(104);
		System.out.println("*********************");
		System.out.println("EmployeeId ==== "+empInfo.getEmp_id());
		System.out.println("EmployeeName === "+empInfo.getName());
		System.out.println("EmployeeDept_id== "+empInfo.getDept_id());
		System.out.println("Employeedesignation=== "+empInfo.getDesignation());
		System.out.println("EmployeeDateofJoin=== "+empInfo.getDate_of_join());
		System.out.println("EmployeeEmail=== "+empInfo.getEmail());
		System.out.println("EmployeeAge== "+empInfo.getAge());
		System.out.println("**********************");
		
		}
	

}
