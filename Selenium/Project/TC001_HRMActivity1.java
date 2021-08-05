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

public class TC001_HRMActivity1 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	
	@Test()
	 public void verifyWebsite_GetTitle() throws InterruptedException
	 {  
		//Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        String Expected = "OrangeHRM";
        String Actual = title;
        Assert.assertEquals(Expected,Actual, "Check the Title of the page");
        logger.info("Title of the page matching as OrangeHRM");
	 }
	
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
