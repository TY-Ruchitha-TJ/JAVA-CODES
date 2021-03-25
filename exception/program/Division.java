package com.tyss.exception.program;

public class Division {
public static void main(String[] args) {
	try {
	System.out.println("statement 1");
	System.out.println("division"+(10/0));
	System.out.println("statement 2");
	
}catch(Exception e){
	System.out.println("statement 3");
	System.out.println("division"+(10/2));
	System.out.println("statement 4");
	
	
}
}
}