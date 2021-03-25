package com.tyss.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {
	public static void main(String[] args) {
		
		
		 ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
			Pet pet = application.getBean(Pet.class);
			Pet pet1 = application.getBean(Pet.class);
			System.out.println(pet==pet1);
			pet.getAnimalDetail();
		
	}

}
