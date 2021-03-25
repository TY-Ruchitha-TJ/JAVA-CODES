package com.tyss.has.hasarelationship;

public class TestHas {
	public static void main(String[] args) {
		
		Address address=new Address(101,"BTM","Bangalore",560078);
		
		Employee employee = new Employee(1,"Ruchi",address);
		
		System.out.println("Employee_Id=="+employee.eid);
		System.out.println("Employee_name=="+employee.name);
		System.out.println("Employee_Address_DoorNo=="+employee.address.doorno);
		System.out.println("Employee_Address_city=="+employee.address.city);
		System.out.println("Employee_Address_Area=="+employee.address.area);
	}

}
