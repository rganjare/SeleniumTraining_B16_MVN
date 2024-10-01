package com.companyname.projectname.modulename.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.companyname.projectname.modulename.testbase.TestBase;
import com.google.common.io.Files;

public class CommonMethods extends TestBase { // Inheritance relation OOPs Concept
	
	public static void takeScreenShot(){		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		File dest = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenShots\\screenshot_" 
				+ timeStamp+ ".png");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			Files.copy(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).build());
		
	}
	
	public static void clickOnWebElement(String xpath, String elmentName) {
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		System.out.println("User clicked on "+elmentName);
		test.info("User clicked on "+elmentName);
		
		//List<String> lst = new ArrayList<String>();
	}
	
	public static void clickOnWebElement(WebElement e, String elmentName) {
			e.click();
		System.out.println("User clicked on "+elmentName);
		test.info("User clicked on "+elmentName);
		
		//List<String> lst = new ArrayList<String>();
	}
	
	public static void enterTextIntoInputBox(String xpath, String data, String message) {// Method Overloading// Polymorphism
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
		System.out.println("User entered "+message +" and it's value is: " +data);
		test.info("User entered "+message +" and it's value is: " +data);
	}
	
	public static void enterTextIntoInputBox(WebElement ele, String data, String message) {// Method Overloading// Polymorphism
		ele.sendKeys(data);
		System.out.println("User entered "+message +" and it's value is: " +data);
		test.info("User entered "+message +" and it's value is: " +data);
	}
	
	
	public static void enterTextIntoInputBox(String xpath, String data) {	// Data type should be different
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
		System.out.println("User entered "+data);
		test.info ("User entered "+data);
	}
	
	public static void enterTextIntoInputBox(WebElement ele, String data) {	// Data type should be different
		ele.sendKeys(data);
		System.out.println("User entered "+data);
		test.info ("User entered "+data);
	}
	

	public static void verfiyPageTitle(String expected_title) {
		String actual_pagetitle = driver.getTitle();
		Assert.assertEquals(actual_pagetitle, expected_title);
		System.out.println("Page title is verified and Title is: "+actual_pagetitle);
		test.pass("Page title is verified and Title is: "+actual_pagetitle);
		takeScreenShot();
	}
	
	public static void verifyTextOnThePage(String xpath, String expected_text) {
		String actual_text = driver.findElement(By.xpath(or.getProperty(xpath))).getText();
		Assert.assertEquals(actual_text, expected_text);
		System.out.println("Page text is verified and the text is: "+actual_text);
		test.pass("Page text is verified and the text is: "+actual_text);
		takeScreenShot();
	}
	
	public static void verifyTextOnThePage(WebElement e, String expected_text) {
		String actual_text = e.getText();
		Assert.assertEquals(actual_text, expected_text);
		System.out.println("Page text is verified and the text is: "+actual_text);
		test.pass("Page text is verified and the text is: "+actual_text);
		takeScreenShot();
	}
	
	public static void selectByVisibleText(String xpath, String visible_Text) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");
		test.pass(visible_Text +" value is selected from the dropdown box");
		takeScreenShot();
	}
	
	public static void selectByVisibleText(WebElement e, String visible_Text) {
		Select sel = new Select(e);
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");
		test.pass(visible_Text +" value is selected from the dropdown box");
		takeScreenShot();
	}
	
	public static void selectByIndex(String xpath, int index) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByIndex(index);
		System.out.println(index +" value is selected from the dropdown box");	
		test.pass(index +" value is selected from the dropdown box");
		takeScreenShot();
	}
	
	public static void selectByValue(String xpath, String value) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByValue(value);
		System.out.println(value +" value is selected from the dropdown box");		
		test.pass(value +" value is selected from the dropdown box");
		takeScreenShot();
	}
	
}
