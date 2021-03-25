package com.tyss.list.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class It1 {
public static void main(String[] args) 
	    { 
	        ArrayList<Integer> list = new ArrayList<Integer>(); 
	  
	        for (int i = 0; i < 8; i++) 
	            list.add(i); 
	  
	        System.out.println(list); 
	  
	        Iterator itr = list.iterator(); 
	  
	        // checking the next element availabilty 
	        while (itr.hasNext()) 
	        { 
	            //  moving cursor to next element 
	            int i = (Integer)itr.next(); 
	  
	            
	            System.out.print(i + " "); 
	  
	            // Removing odd elements 
	            if (i % 2 != 0) 
	               itr.remove();  
	        }  
	        System.out.println(list); 
	    } 

}
