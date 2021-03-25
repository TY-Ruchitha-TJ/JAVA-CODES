package com.tyss.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyss.core.EmployeeAddressInfo;
import com.tyss.core.EmployeePrimaryInfo;
import com.tyss.spring.bean.Cat;
import com.tyss.spring.bean.Hello;
import com.tyss.spring.bean.Lion;
import com.tyss.spring.bean.Pet;


@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		return hello;
	}
	@Bean
	public EmployeeAddressInfo getAddress(){
		EmployeeAddressInfo address=new EmployeeAddressInfo ();
		address.setFlatNo(122);
		address.setAddress("mysore");
		address.setPincode(234178);
		
		return address;
		
			
		}
	
	@Bean
public EmployeePrimaryInfo getPrimary() {
		EmployeePrimaryInfo primary=new EmployeePrimaryInfo();
		primary.setEid(120);
		primary.setName("sumeda");
		return primary;
		
		
	}
	@Bean
	public  Pet getPet() {
		Pet pet=new Pet();
		pet.setName("LionQueen");
		return pet;
	}
	@Bean(name="Cat")
	public Cat getCat() {
		Cat cat = new Cat();
		return cat;
	}
	@Bean(name="Lion")
	public Lion getLion() {
		Lion lion = new Lion();
		return lion;
	}


}
