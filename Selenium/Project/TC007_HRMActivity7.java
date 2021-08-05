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

public class TC007_HRMActivity7 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	
	@Test()
	 public void editMyInfo_Qualification() throws InterruptedException
	 {
		Properties properties=getProp();
		String username=properties.getProperty("AdminLogin");
		String password=properties.getProperty("Adminpwd");
		loginadmin=new LoginAdminPage(driver);
		loginadmin.adminLogin(username, password);
        
		loginadmin.editMyInfoQualification();
		logger.info("Able to update My Info - Qualification wrt Work Experience as Company, Job Title");
		
	 }
   
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
