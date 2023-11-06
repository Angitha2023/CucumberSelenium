package com.example.extendReport;

import org.openqa.selenium.support.PageFactory;

//import com.cucumber.Helperclass_ExtebtReport;
//import com.cucumber.LoginPageLocatorsPOM;

public class LoginPageActions_extentReport {

	LoginPageLocators_extentedReport loginPageLocators = null;
	String strUserName, strPassword;
	
	public  LoginPageActions_extentReport() {  //constructor
		this.loginPageLocators = new LoginPageLocators_extentedReport();
		PageFactory.initElements(Helperclass_ExtebtReport.getDriver(),loginPageLocators);
	}
	
	//set username in textbox
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.passWord.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUsername, String strPassWord) {
		this.setUserName(strUsername);
		this.setPassword(strPassWord);
	}
 
}
