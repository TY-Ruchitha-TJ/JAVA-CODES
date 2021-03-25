
package com.tyss.exception.program;

public class Demo {
	public static void main(String[] args) {
	try {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("divide"+(10/2));
			//e.printStackTrace();
		}finally {
			System.out.println("hello");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
