package com.leapts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.leaftaps.ui.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage()
	{
		
	}
		public LoginPage enterUserName()
		{
		 
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("DemoCSR");
		return this;
		}
		
		public LoginPage enterPassword()
		{
			WebElement passwordElement = driver.findElement(By.id("password"));
			passwordElement.sendKeys("crmsfa");
			return this;
		}
		
		public WelcomePage clickLogin()
		{
			WebElement clickElement = driver.findElement(By.className("decorativeSubmit"));
			clickElement.click();
			return new WelcomePage();
			
		}
	}
	

