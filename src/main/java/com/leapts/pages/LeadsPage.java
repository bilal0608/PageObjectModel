package com.leapts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.leaftaps.ui.base.BaseClass;

public class LeadsPage extends BaseClass {

	public LeadsPage()
	{
		
	}

	public CreateLeadPage clickCreateLead()
	{
		WebElement Createleadlink= driver.findElement(By.linkText("Create Lead"));
		Createleadlink.click();
		return new CreateLeadPage();
	}
}
