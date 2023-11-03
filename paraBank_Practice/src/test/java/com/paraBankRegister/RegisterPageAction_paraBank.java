package com.paraBankRegister;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageAction_paraBank {

	RegisterPageLocators_paraBank registerpagelocators =null;
	String strfirstName , strlastName ,straddress,strcity,strstate,strzipcode,strphone,strssn,struserName,strpassword,strconfirmpass;
	
	
	//constructor
	public RegisterPageAction_paraBank() {
		this.registerpagelocators =new RegisterPageLocators_paraBank();
		PageFactory.initElements(HelperClass_parabank.getDriver(),registerpagelocators);
	}
	
	//first name
	public void setFirstName(String strfirstName) {
		registerpagelocators.firstName.sendKeys(strfirstName);
	}
	
	//last name
	public void setLastName(String strlastName) {
		registerpagelocators.lastName.sendKeys(strlastName);
	}
	//Address
	public void setaddress(String straddress) {
		registerpagelocators.address.sendKeys(straddress);
		
	}
	
     //city
	public void setcity(String strcity) {
		registerpagelocators.address.sendKeys(strcity);
		
	}
	
	//State
	public void setstate(String strstate) {
		registerpagelocators.state.sendKeys(strstate);
		
	}
	
	//zipcode
	public void setzipcode(String strzipcode) {
		registerpagelocators.zipcode.sendKeys(strzipcode);
		
	}
	
	//phone
	public void setphone(String strphone) {
		registerpagelocators.phone.sendKeys(strphone);
			
	}
	
	//ssn 12 digit number
	public void setssn(String strssn) {
		registerpagelocators.ssn.sendKeys(strssn);
				
	}
	
	
	public void setuserName(String struserName) {
			registerpagelocators.userName.sendKeys(struserName);
				
	}
	
	public void setpassword(String strpassword) {
		registerpagelocators.password.sendKeys(strpassword);	
    }
	
	
	public void setconfirmpass(String strconfirmpass) {
		registerpagelocators.confirm.sendKeys(strconfirmpass);	
    }
	
	
	public void click() {
		registerpagelocators.regClick.click();
		
	}
	

	public void login(String strfirstName ,String strlastName ,String straddress,String strcity,String strstate,String strzipcode,String strphone,String strssn,
			String struserName,String strpassword,String strconfirmpass ) {
		
		this.setFirstName(strfirstName);
		this.setLastName(strlastName);
		this.setaddress(straddress);
		this.setcity(strcity);
		this.setstate(strstate);
		this.setzipcode(strzipcode);
		this.setphone(strphone);
		this.setssn(strssn);
		this.setuserName(struserName);
		this.setpassword(strpassword);
		this.setconfirmpass(strconfirmpass);
		
	}
	
	
}
