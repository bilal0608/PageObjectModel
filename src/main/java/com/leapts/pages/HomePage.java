package com.leapts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.leaftaps.ui.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage()
	{
		
	}
	
	public LeadsPage clickLeads()
	{
		
		WebElement clickLeadlink = driver.findElement(By.linkText("Leads"));
		clickLeadlink.click();
		return new LeadsPage();
	}
}
