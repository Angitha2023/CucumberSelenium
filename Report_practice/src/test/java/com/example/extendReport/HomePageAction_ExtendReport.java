package com.example.extendReport;

import org.openqa.selenium.support.PageFactory;
//
//import com.cucumber.HelperClass;
//import com.cucumber.HomePageLocatorsPOM;

public class HomePageAction_ExtendReport {

	HomePageLocators_ExtendReport homePageLocators = null;
 
	
	public  HomePageAction_ExtendReport() {  //constructor
		this.homePageLocators = new HomePageLocators_ExtendReport();
		PageFactory.initElements(Helperclass_ExtebtReport.getDriver(),homePageLocators);
	}
	
	public String getVerifyText() {
		return homePageLocators.nextPage.getText();
	}
	
	
	
	
	
}


