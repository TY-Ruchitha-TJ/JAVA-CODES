package com.tyss.set.programs;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<Integer> lset=new LinkedHashSet();
	lset.add(66);
	lset.add(89);
	lset.add(66);
	lset.add(24);
	lset.add(null);
	lset.add(null);
	System.out.println(lset);
}
}
