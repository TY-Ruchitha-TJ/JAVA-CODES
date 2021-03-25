package com.tyss.spring.bean;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//it is 1st step of implementing lifecycle
//public class Hello implements InitializingBean, DisposableBean {
@Configuration

public class Hello{
	
	private int id;
	private String name;
	
	
	
	
	public Hello() {
		System.out.println("default constructor");
	}
	public Hello(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//2nd step of init and destroy method
	
	public void init() throws Exception{
		System.out.println("Initializingbean");
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void doStuff() {
		System.out.println("welcome to ELF"+" "+ id +" "+ name);
	}

	public void destroy() throws Exception{
		System.out.println("destroy");
	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("destroy");
//		
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//	System.out.println("InitializingBean");
//		
//	}


	

}
