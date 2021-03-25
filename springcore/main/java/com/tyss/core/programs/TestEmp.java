package com.tyss.core.programs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.core.EmployeeAddressInfo;
import com.tyss.core.EmployeePrimaryInfo;
import com.tyss.spring.bean.Hello;

public class TestEmp {
	public static void main(String[] args) {
//		EmployeeAddressInfo addr=new EmployeeAddressInfo();
//		addr.setFlatNo(344);
//		
//		addr.setAddress("basavangudi");
//		addr.setPincode(571401);
//		
//		EmployeePrimaryInfo info = new EmployeePrimaryInfo();
//		info.setEid(100);
//		info.setName("ruchitha");
//		info.setAddress(addr);
//		System.out.println(info.getEid());
//		System.out.println(info.getName());
//		System.out.println(addr.getFlatNo());
//		System.out.println(addr.getAddress());
//		System.out.println(addr.getPincode());
		
		
		 ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
		 EmployeePrimaryInfo info = application.getBean(EmployeePrimaryInfo.class);
		 info.details();

		 
			
	 
		
	}

}
