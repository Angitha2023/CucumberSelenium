package com.example.extendReport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.cucumber.HelperClass;

public class Helperclass_ExtebtReport {

	private static Helperclass_ExtebtReport helperClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;

	Helperclass_ExtebtReport(){

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass=new Helperclass_ExtebtReport();
		}
	}
	
	
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperClass=null;
	}

}
