package com.companyname.projectname.modulename.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;

public class TabsAndWindows_PropsFiles_3 extends TestBase {	// CNTL+Shift+O
	
	@Test //25
	public void loginTest_3() {
		System.out.println("I am in the the testMethod");
		System.out.println("User navigated to URL:" +driver.getCurrentUrl());
		System.out.println("Page title is: " + driver.getTitle());			
							// Actual Value    //Expected Value
		Assert.assertEquals(driver.getTitle(), "Axis Omni Channel");
		
		//Thread.sleep(2000); //20 *1000 = 20000/60 = 
		//driver.findElement(By.xpath("//*[@id=\"custid\"]")).sendKeys("username");
		driver.findElement(By.xpath(or.getProperty("custID"))).sendKeys(config.getProperty("username"));
		System.out.println("User entered Username");
		
		//Thread.sleep(2000); // Java Utility
		driver.findElement(By.xpath(or.getProperty("pass"))).sendKeys(config.getProperty("password"));
		System.out.println("User entered password");
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("axisgp"))).click();
		System.out.println("User clicked on axis-group option");
	}
	
}