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

public class TC004_HRMActivity4 extends TestBase {

	LoginAdminPage loginadmin;
	@BeforeTest
	public void setUp()
	{   
		Properties properties=getProp();
	    String URL=properties.getProperty("URL");
		init(URL);
	}
	
	@Test()
	 public void addEmployee() throws InterruptedException
	 {
		Properties properties=getProp();
		String username=properties.getProperty("AdminLogin");
		String password=properties.getProperty("Adminpwd");
		loginadmin=new LoginAdminPage(driver);
		loginadmin.adminLogin(username, password);
        
		loginadmin.addEmpHeadVerify();
		Assert.assertEquals(loginadmin.addEmployeeText(), "Add Employee");
		
	 }
   
	@Test(priority=2)
	 public void verifyUserAccountdetails() throws InterruptedException
	 {
		Properties properties=getProp();
		String firstName=properties.getProperty("firstName");
		String lastName=properties.getProperty("lastName");
		//String accUserName=properties.getProperty("accUserName");
		//String accUserPass=properties.getProperty("accUserPassword");
		//String accRePass=properties.getProperty("accRePassword");
		//String EntitlementValue=properties.getProperty("entitleMentVal");
		//String fullNAmeEmp=properties.getProperty("fullName");
	
	    loginadmin=new LoginAdminPage(driver);
		loginadmin.addEmployeeOption(firstName, lastName);
		
		String fullName=properties.getProperty("fullName");
		loginadmin.SearchEmployee(fullName);
		
	 }
  
   
	@AfterTest
	public void closeDriver()
	{
		//Close the browser
        driver.quit();
	}
}
