package com.tyss.constructor.ths;

public class Demo {
	public Demo() {
	this(10);
		System.out.println("default constructor");
	}
	public Demo(double i) {
		this(30,34.55);
		System.out.println("double one parameter constructor"+i);
	}
	public Demo(int i) {
	this(30,34.55);
	System.out.println("int parameter constructor"+i);
}

public Demo(int x,double y) {
	System.out.println("two parameter constructor"+x+" "+y);
}
}
