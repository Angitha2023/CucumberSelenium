package com.orangeHRM;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefanitionOrangeHRM {

	WebDriver driver;
	
	@Given("User is on HRM Login Web Application")
	public void user_is_on_hrm_login_web_application() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("User provides valid credentials")
	public void user_provides_valid_credentials(DataTable dataTable) {
		System.out.println("Credentials Entered");
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> form : signUpForm) {
			String userName = form.get("Username");
//			String userName = signUpForm.get(0).get("Username");
			System.out.println("Username: "+ userName);
			driver.findElement(By.name("username")).sendKeys(userName);
			
			String passWord = form.get("Password");
//			String passWord = signUpForm.get(0).get("Password");
			System.out.println("Password");
			driver.findElement(By.name("password")).sendKeys(passWord);
						
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		}
	}

	@Then("User should be able to login successfully and see homepage")
	public void user_should_be_able_to_login_successfully_and_see_homepage() {
	    String newPageText =driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).getText();
	    System.out.println("newPageText:" +newPageText);
	    Assert.assertTrue(newPageText.equals("Dashboard"));
				
		
	}

	@Then("User should be able to see unsuccessfull with error message")
	public void user_should_be_able_to_see_unsuccessfull_with_error_message() {
	    String expectedError = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")).getText();
		Assert.assertTrue(expectedError.contains("Invalid credentials"));
		System.out.println("Expected Error Message: " + expectedError);
		
	}

}
