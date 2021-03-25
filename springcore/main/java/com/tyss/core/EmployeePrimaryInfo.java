package com.tyss.core;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeePrimaryInfo {
	int eid;
	String name;
	@Autowired
	EmployeeAddressInfo address;
	public EmployeePrimaryInfo() {
		
	}
	
	public EmployeePrimaryInfo(int eid, String name, EmployeeAddressInfo address) {
		
		this.eid = eid;
		this.name = name;
		this.address = address;
		
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(EmployeeAddressInfo address) {
		this.address = address;
	}
	public void details() {
		System.out.println("eid=="+eid+" "+"name==" +name+" " +"address=="+ address);
	}
	

	

}
