package pom.leaftaps.ui.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaptaps.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//	public static RemoteWebDriver driver;
//	public String excelFileName;
//	
//	@Parameters({"browserName" , "URL"})
//	@BeforeMethod
//	public void beforeMethod (String browserName , String url)
//	{
//		if(browserName.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}else
//		{
//			WebDriverManager.edgedriver().setup();
//		    driver = new EdgeDriver();
//	}
//	driver.get(url);
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
   public static RemoteWebDriver driver;
	@BeforeMethod
	public void beforeMethod() throws IOException
		{ 
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./config/AppConfig.properties");
		prop.load(file);
	    WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
//	
//	@AfterMethod
//	public void afterMethod()
//	{
//		
//		driver.quit();
//	}
}
//	@DataProvider
//	public String[][] testData() throws IOException
//	{
//		return ReadExcelData.getData(excelFileName);
//	}
//}
