
package com.tyss.list.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMyArray {
	public static void main(String[] args) {
		MyArrayList mylist = new MyArrayList();
	
		mylist.increaseSize(10);
		mylist.increaseSize(20);
		mylist.increaseSize(10);
		mylist.increaseSize(20);
		mylist.increaseSize(20);
		mylist.increaseSize(10);
		mylist.increaseSize(20);
		
//		for(Object a) {
//			System.out.println("forEach"+a);	
//			}
//		
		System.out.println(mylist);
		System.out.println(mylist.remove(0));
		System.out.println(mylist);
		Iterator<Integer> itr=mylist.iterator();
		while(itr.hasNext()) {
			System.out.println("iterator"+itr.next());
		}

		
	}
}
