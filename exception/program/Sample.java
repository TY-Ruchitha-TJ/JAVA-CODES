package com.tyss.exception.program;

public class Sample {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	//	e.getMessage();
	//	e.toString();
	}
}
}
