package com.tyss.objectclass.hasgcode;

public class Person {
int pid;

//@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//	//return 100;it is improper
//		return pid;
//}
public static void main(String[] args) {
	Person person=new Person();
	person.hashCode();
	System.out.println(person.pid);
}
}
