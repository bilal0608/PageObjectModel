package com.leapts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.leaftaps.ui.base.BaseClass;

public class WelcomePage extends BaseClass {

	public WelcomePage()
	{
		
	}
	public HomePage clickCRMSFA()
	{
		WebElement CRMSFAElement = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFAElement.click();
		return new HomePage();
}
	}

