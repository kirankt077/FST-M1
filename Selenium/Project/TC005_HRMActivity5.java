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

public class TC005_HRMActivity5 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	
	@Test()
	 public void editMyInfo() throws InterruptedException
	 {
		Properties properties=getProp();
		String username=properties.getProperty("AdminLogin");
		String password=properties.getProperty("Adminpwd");
		loginadmin=new LoginAdminPage(driver);
		loginadmin.adminLogin(username, password);
        
		loginadmin.editMyInfo();
		logger.info("Able to Fill in the Name, Gender, Nationality, and the DOB fields");
		
	 }
   
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
