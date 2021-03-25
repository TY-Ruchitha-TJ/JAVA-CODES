package com.tyss.inheritance.defaults;

public class SpaceCalculator extends scientificCalculator {
	public void mod(int x, int y) {
		System.out.println("mod of two numbers"+(x%y));
	}

}
