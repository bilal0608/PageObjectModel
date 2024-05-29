package com.testng.dataprovider.learning;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CreateLead extends BaseClass{


	@Test (dataProvider="fetch")
	public void createLead(String cname, String fname, String Lname){
      
		WebElement clickLeadlink = driver.findElement(By.linkText("Leads"));
		clickLeadlink.click();
		WebElement Createleadlink= driver.findElement(By.linkText("Create Lead"));
		Createleadlink.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys(cname);
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys(fname);
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys(Lname);
		WebElement CreateButton = driver.findElement(By.name("submitButton"));
		CreateButton.click();
				
	}

	@Test
	public void printValues()
	{
		System.out.println("success");
		
	}
	
@DataProvider(name="fetch")
public String[][] testData() throws IOException
{
	String[][] leadData = ReadExcelFile.leadData();
	
	return leadData;
	
}

}
