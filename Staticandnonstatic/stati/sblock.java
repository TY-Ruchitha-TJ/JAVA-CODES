package com.tyss.Staticandnonstatic.stati;

public  class sblock {
	static int id;
	static {
		id=133;
		System.out.println("first block"+id);
		}
	static {
		System.out.println("second block");
		}
	static {
		System.out.println("third block");
		}
	static {
		System.out.println("fourth block");
		}
	public static void main(String[] args) {
		System.out.println("main method");
		//TODO Auto-generated method stub
	}//end of main method

}//end of class 
