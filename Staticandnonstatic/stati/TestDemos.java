package com.tyss.Staticandnonstatic.stati;

public class TestDemos {
	public static void main(String[] args) {
		Demos demos=new Demos();
		System.out.println(demos.id);
		System.out.println(demos.name);
		demos.Works();
		Demos demo=new Demos();
		System.out.println(demo.id);
		System.out.println(demo.name);
		demos.Works();
	}

}
