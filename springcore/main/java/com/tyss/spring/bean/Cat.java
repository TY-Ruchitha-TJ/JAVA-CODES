package com.tyss.spring.bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class Cat implements Animal {
	public void makeSound() {
		System.out.println("cat is making meow");
	}

	@Override
	public void eat() {
		System.out.println("drink milk");
		
	}

}
