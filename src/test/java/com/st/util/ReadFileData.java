package com.st.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

	String propertyFilePath = System.getProperty("user.dir")+"src\\test\\resource\\TestData\\testData.properties";
	
	
	File file = new File(propertyFilePath);
	  
	FileInputStream fileInput =null;
	{
	try 
	{
		fileInput = new FileInputStream(propertyFilePath);
	}
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	Properties prop = new Properties();
	
	//load properties file
	try
	{
		prop.load(fileInput);
	} 
	catch (IOException e1) 
	{
		e1.printStackTrace();
	}
}
	
}