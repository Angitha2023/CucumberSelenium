package com.example.extendReport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators_ExtendReport {

	public class HomePageLocatorsPOM {
		@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
		public WebElement nextPage;
	 
	}
}
