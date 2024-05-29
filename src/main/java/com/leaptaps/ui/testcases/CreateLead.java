package com.leaptaps.ui.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.leapts.pages.LoginPage;

import pom.leaftaps.ui.base.BaseClass;

public class CreateLead extends BaseClass{
	
	
@Test	
public void createLead()
{
	new LoginPage().enterUserName()
	.enterPassword()
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName()
	.enterFirstName()
	.enterLastName()
	.clickCreateLeadButton()
	.leadsviewpage();
}

}
