package com.tyss.list.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class It3{
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(29);
		num.add(8);
		num.add(20);
		num.add(90);
		num.add(76);
		num.add(96);
		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			int ig = (Integer) it.next();
		
			if (ig < 15) {
				it.remove();
			}

		}
		System.out.println(num);
	}

}
