package com.tyss.exception.program;

public class Test1 {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,50};
		
			System.out.println("statement 1");
			
			try {
			System.out.println(a[6]);
			try {
				System.out.println("statement");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			
		try {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.exit(0);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		}
			catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		
		}
		catch (Exception e) {
	
			System.out.println("Exception");
			
		}finally {
			System.out.println("inside finally");
		}
		System.out.println("statement 2");
		
	}

}
