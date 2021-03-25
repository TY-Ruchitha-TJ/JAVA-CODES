package com.tyss.set.programs;

import java.util.TreeSet;

public class Testalphabetic {
 public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet(new Alphabet<String>());
	ts.add("c");
	ts.add("d");
	ts.add("A");
	ts.add("a");
	ts.add("E");
	ts.add("B");
	ts.add("e");
	ts.add("D");
	System.out.println(ts);
}
}
