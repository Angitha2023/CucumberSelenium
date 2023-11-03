package com.paraBankRegister;

//import com.cucumber.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass_Register {

	@Before
	public static void setUp() {
		HelperClass_parabank.setUpDriver();
	}
	@After
	public static void tearDown() {
		HelperClass_parabank.tearDown();
	}
 
	
	
}
