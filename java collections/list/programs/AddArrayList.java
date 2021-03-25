package com.tyss.list.programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class AddArrayList {
	public static void main(String[] args) {
	 
		ArrayList list=new ArrayList();
		list.add(20);
		list.add(12);
		list.add("namrata");
		list.add(23);
		list.add("ruchitha");
		System.out.println(list);
		//for loop
		for( int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}//end of for loop
		//for-Each loop
		for(Object a : list) {
	System.out.println("forEach"+a);	
	}
		
		Iterator iterator= list.iterator();
		while(iterator.hasNext()) {
			Integer lst=(Integer) iterator.next();
			System.out.println("iterator"+lst);
		}

}//end of the main method
	}//end of the class

