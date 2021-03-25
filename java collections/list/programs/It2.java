package com.tyss.list.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class It2 {
public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ruchi");
		names.add("Rachu");
		names.add("Harshi");
		names.add("ramya");
		names.add("rani");
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}

