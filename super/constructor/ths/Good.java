package com.tyss.constructor.ths;

public class Good {
Good(){
	this(10);
	System.out.println("first constructor");
}
Good(int i){
	//this();
	System.out.println("second constructor");
	
}
}
