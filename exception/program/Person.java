package com.tyss.exception.program;

public class Person {
public static void main(String[] args) {
	System.out.println("statement 1");
	try {
		System.out.println("division"+(10/0));
		System.out.println("next line");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
