package com.Ranka.generic;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	

	public class Base_class implements Framework_constants 
	{
		public  WebDriver driver;
	  @BeforeMethod
	  public void launch()
	  {
		 System.setProperty(gecko_key,gecko_val);
		  driver=new FirefoxDriver();
		  driver.get(Base_url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com");
	  }
	  @AfterMethod
	  public void closeapp(ITestResult res) throws IOException
	  {
		  if(ITestResult.FAILURE==res.getStatus())
		  {
			  Screenshot.screen(driver);
		  }
		  
		  driver.close();
	  }
	}

	


