package com.paraBankRegister;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators_paraBank {

	
	@FindBy(xpath="//input[@id='customer.firstName']")
	public WebElement firstName;
	
	@FindBy(name="customer.lastName")
	public WebElement lastName;
		
	@FindBy(xpath="//input[@id='customer.address.street']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement zipcode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public WebElement phone;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	public WebElement ssn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='customer.password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	public WebElement confirm;
	
	@FindBy(xpath="//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input")
	public WebElement regClick;
	
	
	
}
