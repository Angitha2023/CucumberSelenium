package com.example.extendReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilityclass_extendReport {

	String url;
	String username;
	String password;
	
	public Utilityclass_extendReport(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\avelayudhan\\eclipse-workspace\\Report_practice\\src\\test\\resources\\data1.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		username = prop.getProperty("username");
	    password = prop.getProperty("password");
	}

	
	
	
	
}
