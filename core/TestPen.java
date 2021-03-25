package com.tyss.corejava.test;

public class TestPen {
public static void main(String[] args) {
	Pen p = new Pen();
	System.out.println("pen color"+" "+p.color);
	System.out.println("pen name"+" "+p.name);
	System.out.println("pen quality"+" "+p.quality);
	System.out.println(p.price);
	p.write();
	
	
}//end of method
}//end of class
