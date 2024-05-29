package com.testng.dataprovider.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public RemoteWebDriver driver;
	@Parameters({"browser","url", "uname", "pwd"})
	@BeforeMethod
	public void preConditon(String browser, String url, String uname, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys(uname);
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys(pwd);
		WebElement clickElement = driver.findElement(By.className("decorativeSubmit"));
		clickElement.click();
		WebElement CRMSFAElement = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFAElement.click();
		
	}



}
