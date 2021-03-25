package com.tyss.set.programs;

import java.util.TreeSet;

public class TestComparator {
public static void main(String[] args) {
	TreeSet<Integer> tree=new TreeSet<Integer>(new MyComparator<Integer>());
	tree.add(67);
	tree.add(6);
	tree.add(8);
	tree.add(45);
	tree.add(89);
	System.out.println(tree);
}
}
