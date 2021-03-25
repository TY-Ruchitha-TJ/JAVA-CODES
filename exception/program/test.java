
package com.tyss.exception.program;

public class test {
	public static void Stuff() throws ArithmeticException{
		System.out.println( 10/0);
	}
	public static void Stuff1() throws ArithmeticException {
		Stuff();
		System.out.println("inside stuff1()");

	}
	public static void Stuff2() throws ArithmeticException {
		Stuff1();
		System.out.println("inside stuff2()");
		
	}
	public static void main(String[] args)  {
		try {
			Stuff2();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("divide"+(10/2));

		}
	}



}
