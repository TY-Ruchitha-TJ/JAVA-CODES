package com.tyss.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration


public class Pet {
	private String name;
	@Qualifier("Lion")
	@Autowired
	private Animal animal;
	
	
	
	public void getAnimalDetail() {
		System.out.println("name==="+name);
		animal.eat();
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}


	public Pet() {
		// TODO Auto-generated constructor stub
	}

}
