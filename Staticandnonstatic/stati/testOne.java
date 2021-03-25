
package com.tyss.Staticandnonstatic.stati;

public class testOne {
	public static void main(String[] args) {
		System.out.println(DemoOne.id);
		DemoOne.works();
		DemoOne demo = new DemoOne();
		//demo.name="harshi";
		System.out.println(demo.name);
		demo.stuff();
		
		
		
	}

}
