package com.tyss.myproperties.pro;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {
	public static void main(String[] args) throws Exception {
		FileInputStream inStream = new FileInputStream ("my properties.properties");
		Properties pro=new Properties();
		pro.load(inStream);
		String name =(String) pro.get("name");
		String salary=(String) pro.get("salary");
		System.out.println("name=="+name+"salary=="+salary);
		
		
	}

}
