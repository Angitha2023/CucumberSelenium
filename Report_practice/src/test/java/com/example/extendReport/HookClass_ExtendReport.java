package com.example.extendReport;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass_ExtendReport {

	@Before
	public static void setUp() {
		Helperclass_ExtebtReport.setUpDriver();
	}
	@After
	public static void tearDown() {
		Helperclass_ExtebtReport.tearDown();

}
}
