package com.tyss.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	public static void main(String[] args) {
//		Hello hello = new Hello();
//		hello.doStuff();
		 ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
		Hello hello = application.getBean(Hello.class);
		hello.doStuff();
		
		
		application.close();
	}

}


