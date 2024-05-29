package com.leapts.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.leaftaps.ui.base.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage enterCompanyName()
	{
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("test234");
		return this;
	}
	
	public CreateLeadPage enterFirstName()
	{
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("first234");
		return this;
	}
	
	public CreateLeadPage enterLastName()
	{
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("ahamed234");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement CreateButton = driver.findElement(By.name("submitButton"));
		CreateButton.click();
		return new ViewLeadPage();
	}
}
