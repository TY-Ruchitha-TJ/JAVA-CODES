package com.tyss.set.programs;

import java.util.HashSet;

public class MyHashSet {
public static void main(String[] args) {
	HashSet<Integer> hashset=new HashSet();
	hashset.add(78);
	hashset.add(86);
	hashset.add(45);
	hashset.add(86);
	hashset.add(null);
	hashset.add(null);
	
	
	System.out.println(hashset.add(78));

	System.out.println(hashset);
}
}
