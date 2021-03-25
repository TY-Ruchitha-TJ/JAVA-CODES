package com.tyss.spring.bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class Lion implements Animal{
	public void makeSound() {
		System.out.println("Lion is Roaring");
	}

	@Override
	public void eat() {
		System.out.println("eating flesh");
		
	}

}
