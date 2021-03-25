package com.tyss.core.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.core.EmployeeAddressInfo;
import com.tyss.core.EmployeePrimaryInfo;
import com.tyss.spring.bean.Hello;
import com.tyss.spring.bean.Pet;

public class TestAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//Hello hello=context.getBean(Hello.class);
//		Hello hello1=context.getBean(Hello.class);
//		System.out.println(hello==hello1);
		
//		hello.doStuff();
//		EmployeePrimaryInfo primary=context.getBean(EmployeePrimaryInfo .class);
//		primary.details();
		
		Pet pet=context.getBean(Pet.class);
		pet.getAnimalDetail();
		
	}//end of main method
	

}//end of class
