package com.tyss.inheritance.defaults;

public class TestCalculator {
	public static void main(String[] args) {
		//scientificCalculator sc = new scientificCalculator();
		SpaceCalculator sc=new SpaceCalculator();
		
		sc.sum(2,4);
		sc.diff(6,8);
		sc.multi(2, 4);
		sc.div(10, 2);
		
		
		
		sc.square(5);
		sc.mod(5, 6);
		
		
	}//end of main method

}//end of the class
