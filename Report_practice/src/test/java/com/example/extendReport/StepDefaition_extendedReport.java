package com.example.extendReport;

import org.testng.Assert;

//import org.testng.Assert;

//import com.cucumber.Helperclass_ExtebtReport;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefaition_extendedReport {
	
	Utilityclass_extendReport data = new Utilityclass_extendReport();
	LoginPageActions_extentReport objLogin = new LoginPageActions_extentReport();
	HomePageAction_ExtendReport objHome = new HomePageAction_ExtendReport();
	

	@Given("User launches the website")
	public void user_launches_the_website() {
		Helperclass_ExtebtReport.openPage(data.url);
	    System.out.println("login page");
	}

	@When("User enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		objLogin.login(data.username, data.password);
		System.out.println("Username and password");
	}

	@Then("User successfully loged in the application")
	public void user_successfully_loged_in_the_application() {
		objLogin.clickLogin();
		System.out.println("login button");
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		System.out.println("sucessfull login");
	}
}
