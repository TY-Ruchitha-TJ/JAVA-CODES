package com.tyss.abstrac.interfac;

public abstract class NormalCalculator implements Calculator {

	@Override
	public void add() {
		System.out.println("addition");
		}

	@Override
	public void sub() {
		System.out.println("subtraction");
		}

	@Override
	public abstract void multiply();

	@Override
	public abstract void divide();

}
