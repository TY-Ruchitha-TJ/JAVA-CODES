package com.tyss.Staticandnonstatic.stati;

public class TestDemo {
	public static void main(String[] args) {
		Demo.id=102;//here id is overlapping
		System.out.println(Demo.id);
		System.out.println(Demo.name);
		Demo.Work();
	}//end of method

}//end of class
