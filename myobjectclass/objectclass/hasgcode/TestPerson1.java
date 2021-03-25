package com.tyss.objectclass.hasgcode;

public class TestPerson1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person1 p=new Person1(101,"ruchitha");
		//Person1 p1=new Person1(101,"ruchitha");
		//Person p1=p;
		
	//	System.out.println(p==p1);
		String name="raja";
		String names="raji";
		System.out.println(name.equals(names));
		
		System.out.println(p);
		System.out.println(p.toString());
	//boolean result=p.equals(p2);
	//	System.out.println(result);
		
	}

}
