package com.companyname.projectname.modulename.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class TabsAndWindows_PropsFiles_1 extends TestBase {	// CNTL+Shift+O
	
	@Test //25 // Business logic
	public void loginTest_1() {
		System.out.println("I am in the the testMethod");
		System.out.println("User navigated to URL:" +driver.getCurrentUrl());
		System.out.println("Page title is: " + driver.getTitle());			
							// Actual Value    //Expected Value
		Assert.assertEquals(driver.getTitle(), "Axis Omni Channel");
		
		//Thread.sleep(2000); //20 *1000 = 20000/60 = 
		//driver.findElement(By.xpath("//*[@id=\"custid\"]")).sendKeys("username");
		CommonMethods.enterTextIntoInputBox("custID", config.getProperty("username"), "username");
		//driver.findElement(By.xpath(or.getProperty("custID"))).sendKeys(config.getProperty("username"));
		//System.out.println("User entered Username");
		CommonMethods.takeScreenShot();
		//Thread.sleep(2000); // Java Utility
		//driver.findElement(By.xpath(or.getProperty("pass"))).sendKeys(config.getProperty("password"));
		//System.out.println("User entered password");
		CommonMethods.enterTextIntoInputBox("pass", config.getProperty("password"), "password");
		
		CommonMethods.takeScreenShot();
	//	Thread.sleep(2000);
		
		CommonMethods.clickOnWebElement("axisgp", "axis-group option");
		
	//	driver.findElement(By.xpath(or.getProperty("axisgp"))).click();
	//	System.out.println("User clicked on axis-group option");
		CommonMethods.takeScreenShot();
	}
	
	

}