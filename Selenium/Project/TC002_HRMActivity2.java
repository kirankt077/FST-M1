package com.orangeHRM.commons.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.common.pageobjects.LoginAdminPage;
import com.orangeHRM.testbase.TestBase;

public class TC002_HRMActivity2 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	

	@Test()
	 public void verifyURLofImage() throws InterruptedException
	 {
		// identify image
	      WebElement l =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
	      
	      //getAttribute() to get URL of the image
	      System.out.println("Print the URL of the image: "+ l.getAttribute("src"));
		
	 }
	
   
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
