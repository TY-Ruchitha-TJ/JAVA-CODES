package com.tyss.designpattern.services;

import java.util.List;

import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOFactory;
import com.tyss.designpattern.dao.EmployeeDAOJDBCImp1;
import com.tyss.designpattern.dao.EmployeeDAOJPAImp;
import com.tyss.designpattern.dao.EmployeeDAOSPRINGJDBDIMPL;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;


public class TestDao {
	public static void main(String[] args) {
		//EmployeeDAOJDBCImp1 jdbc = new EmployeeDAOJDBCImp1();
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		List<EmployeePrimaryInfo> empInfoo = service.getAllDetailEmployee();
//		
//		for (EmployeePrimaryInfo empInfo : empInfoo) {
//			System.out.println("*********************");
//			System.out.println("EmployeeId ==== "+empInfo.getEmp_id());
//			System.out.println("EmployeeName === "+empInfo.getName());
//			System.out.println("EmployeeDept_id== "+empInfo.getDept_id());
//			System.out.println("Employeedesignation=== "+empInfo.getDesignation());
//			System.out.println("EmployeeDateofJoin=== "+empInfo.getDate_of_join());
//			System.out.println("EmployeeEmail=== "+empInfo.getEmail());
//			System.out.println("EmployeeAge== "+empInfo.getAge());
//			System.out.println("**********************");
//		}
//			
		//EmployeeDAO dao = new EmployeeDAOSPRINGJDBDIMPL();
		
	//	EmployeePrimaryInfo empInfo = dao.getDetailsByEmployeeID(104);
//		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		
//*********************************************************************************************
		
//  get details on id for  jdbc		
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		EmployeePrimaryInfo empInfo = service.getDetailsByEmployeeID(104);
//		
//		System.out.println("*********************");
//		System.out.println("EmployeeId ==== "+empInfo.getEmp_id());
//		System.out.println("EmployeeName === "+empInfo.getName());
//		System.out.println("EmployeeDept_id== "+empInfo.getDept_id());
//		System.out.println("Employeedesignation=== "+empInfo.getDesignation());
//		System.out.println("EmployeeDateofJoin=== "+empInfo.getDate_of_join());
//		
//		System.out.println("EmployeeEmail=== "+empInfo.getEmail());
//		System.out.println("EmployeeAge== "+empInfo.getAge());
//		System.out.println("**********************");
//	}
		
	

//***********************************************************************************************		
		
		//create of jdbc
	
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		EmployeePrimaryInfo ei = new EmployeePrimaryInfo();
//		ei.setEmp_id(1878);
//		ei.setName("shashank");
//		boolean blnn = service.createEmployeeDetail(ei);
//		System.out.println(blnn);
//		
//************************************************************************************************		
		//delete of jdbc
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		boolean bln = service.deleteByEmployeeId(117);
//		System.out.println(bln);
//***************************************************************************************************		
		
		//update of jdbc
//		//EmployeeDAO dao= EmployeeDAOFactory.getInstance();
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		EmployeePrimaryInfo inf = new EmployeePrimaryInfo();
//		inf.setEmp_id(129);
//		boolean bool = service.updateEmployeeDetail(inf);
//		if(bool) {
//			System.out.println("updated");
//		} else {
//			System.out.println("not updated");
//		}
//****************************************************************************************************		
		
		//*********Services********
		
		//get all employee details of jpa with hibernate
		
//	EmployeeServiceInfo service = new EmployeeServiceInfo();
//	List<EmployeePrimaryInfo> empInfoo = service.getAllDetailEmployee();
//for (EmployeePrimaryInfo empInfo : empInfoo) {
//	System.out.println("*********************");
//	System.out.println("EmployeeId ==== "+empInfo.getEmp_id());
//	System.out.println("EmployeeName === "+empInfo.getName());
//	System.out.println("EmployeeDept_id== "+empInfo.getDept_id());
//	System.out.println("Employeedesignation=== "+empInfo.getDesignation());
//	System.out.println("EmployeeDateofJoin=== "+empInfo.getDate_of_join());
//	System.out.println("EmployeeEmail=== "+empInfo.getEmail());
//	System.out.println("EmployeeAge== "+empInfo.getAge());
//	System.out.println("**********************");
//}
		
//*******************************************************************************************************
		
		//get employee detatils based on id of jpa with hibernate
		
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		EmployeePrimaryInfo empInfo = service.getDetailsByEmployeeID(104);
//		
//		System.out.println("*********************");
//		System.out.println("EmployeeId ==== "+empInfo.getEmp_id());
//		System.out.println("EmployeeName === "+empInfo.getName());
//		System.out.println("EmployeeDept_id== "+empInfo.getDept_id());
//		System.out.println("Employeedesignation=== "+empInfo.getDesignation());
//		System.out.println("EmployeeDateofJoin=== "+empInfo.getDate_of_join());
//		System.out.println("EmployeeEmail=== "+empInfo.getEmail());
//		System.out.println("EmployeeAge== "+empInfo.getAge());
//		System.out.println("**********************");
		
//**********************************************************************************************************
		
		//update employee jpa  with hibernate
		
		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
		emp.setEmp_id(105);
		emp.setName("Sakshi");
		EmployeeServiceInfo service = new EmployeeServiceInfo();
		boolean bln = service.updateEmployeeDetail(emp);
		if (bln)
			System.out.println("updated record");
		else
			System.out.println("cannot be updated");
//	
//*************************************************************************************************************		
		
		//delete employee jpa with hibernate
		
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		boolean bln = service.deleteByEmployeeId(20);
//		if (bln) {
//			System.out.println("record deleted successfully");
//		} else {
//			System.out.println("record cannot be deleted ");
//		}
//**************************************************************************************************************		
		
		//create employee jpa with hibernate
		
//		EmployeeServiceInfo service = new EmployeeServiceInfo();
//		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
//		emp.setEmp_id(21);
//		emp.setName("Jayaram");
//		emp.setEmail("jayaram1@gmail.com");
//		emp.setMobile_no(912378962);
//		emp.setDesignation("HR");
//		emp.setDate_of_join("12-11-2019");
//		emp.setSalary(19000);
//		emp.setAge(33);
//		emp.setDept_id(19);
//		boolean bln = service.createEmployeeDetail(emp);
//		if(bln) {
//			System.out.println("record inserted");
//		}else {
//			System.out.println("record cannot be inserted");
//		}
//***************************************************************************************************************		
		
	}
		
		
		

		
	}
	

