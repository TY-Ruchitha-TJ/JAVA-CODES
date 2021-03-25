package com.tyss.set.programs;

import java.util.Comparator;

public class Alphabet<String> implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		if(o1.equals(o2)) 
			return +100;
		else if(o2.equals(o1)) 
			return -100;
		else 
			return 0;
//  System.out.println("alphabet 1" +o1 +"alphabet 2"+ o2);	
 // return o1compareTo(o2);
	}

	

}
