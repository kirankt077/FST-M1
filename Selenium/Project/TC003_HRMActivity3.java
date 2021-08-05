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

public class TC003_HRMActivity3 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	
	@Test()
	 public void verifyLogin() throws InterruptedException
	 {
		Properties properties=getProp();
		String username=properties.getProperty("AdminLogin");
		String password=properties.getProperty("Adminpwd");
		loginadmin=new LoginAdminPage(driver);
		loginadmin.adminLogin(username, password);
        
        String ActualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[8]/a/b")).getText();
        String ExpectedResult = "Dashboard";
        
        Assert.assertEquals(ActualResult,ExpectedResult,"Logged in Dashboard screen should be displayed.");
        logger.info("After login Dashboard screen is displayed.");
		
	 }
   
   
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
