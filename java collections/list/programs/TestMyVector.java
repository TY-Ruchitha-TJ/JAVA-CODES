package com.tyss.list.programs;

public class TestMyVector {
public static void main(String[] args) {
	MyVector mv=new MyVector();
	mv.add(37);
	mv.add(78);
	mv.add(45);
	mv.add(68);
System.out.println(mv);
System.out.println(mv.toString());
System.out.println(mv.remove(3));
System.out.println(mv);

}
}
