package com.tyss.core;

public class EmployeeAddressInfo {
	int flatNo;
	String address;
	int pincode;
	public EmployeeAddressInfo() {
		
	}
	
	public EmployeeAddressInfo(int flatNo, String address, int pincode) {
		
		this.flatNo = flatNo;
		this.address = address;
		this.pincode = pincode;
		
	}
	
	public void stuff() {
		System.out.println(flatNo + address + pincode);
	}
	@Override
	public String toString() {
		return " flatNo=" + flatNo + ", address=" + address + ", pincode=" + pincode  ;
	}
	
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
