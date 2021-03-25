package com.tyss.designpattern;

public class Singleton {
	private static Singleton singleton = null;
	private Singleton(){
		
	}
	public static Singleton getInstance() {
		
	   singleton = new Singleton();
	  
	  if (singleton== null) {
		  
		  return singleton;
		  
	  }else {
		  return singleton;
	  }
		
	}

}
