package com.tyss.myproperties.pro;

import java.io.File;
import java.util.Properties;
import java.io.FileOutputStream;

public class FileWriter {
	public static void main(String[] args)throws Exception {
		FileOutputStream outputStream=new FileOutputStream("firstproperties.properties");
		Properties pro=new Properties();
		pro.setProperty("name","ruchi");
		pro.setProperty("mail", "ruchi.com");
		pro.store(outputStream, "comments");
	System.out.println("properties file created");

}//end of main method
}
