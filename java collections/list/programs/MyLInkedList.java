package com.tyss.list.programs;

import java.util.LinkedList;

public class MyLInkedList {
	public static void main(String[] args) {
		LinkedList<Integer> llist=new LinkedList<Integer>();
		llist.add(100);
		llist.add(200);
		llist.add(250);
		llist.add(678);
		llist.addFirst(234);
		llist.addLast(345);
		System.out.println(llist);
		
	}

}
