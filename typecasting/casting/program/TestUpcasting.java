package com.tyss.casting.program;

public class TestUpcasting {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.work();
		dog.doStuff();
		dog.study();
		dog.play();
		
		Animal animal=new Dog();
		animal.work();
		animal.play();
		
		Dog a=(Dog) animal;
	
		
		
	}

}
