package com.tyss.list.programs;

import java.util.Stack;
import java.util.Vector;

public class NorVector {
public static void main(String[] args) {
	Stack vect=new Stack();
	vect.add(78);
	vect.add(809);
	vect.add(4);
	vect.add(90);
	vect.add(46);
	System.out.println(vect);
	System.out.println(vect.peek());
	System.out.println(vect.pop());
	System.out.println(vect.push(33));
	System.out.println(vect);
}
}
