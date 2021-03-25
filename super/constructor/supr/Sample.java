package com.tyss.constructor.supr;

public class Sample {
	int id;
	String name;
	
	public Sample(int id, String name) {
		super();
	//System.out.println("default constructor sample");
		this.id=id;
		this.name=name;
		System.out.println("parameterized ");
	}

}
