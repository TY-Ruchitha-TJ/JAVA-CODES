package com.tyss.exception.program;

public class TestAge {
	public void aged(int age)throws InvalidAge{
		if(age<18) {
			throw new InvalidAge("Age not supported");
			
		}else {
			System.out.println("Welcome to vote");
		}
	}
	

}
