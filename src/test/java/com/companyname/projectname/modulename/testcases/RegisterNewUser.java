package com.companyname.projectname.modulename.testcases;

import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class RegisterNewUser extends TestBase { // Business logic
	
	@Test
	public void registerNewUser() {
		
	//	String pagetitle = driver.getTitle();
	//	Assert.assertEquals(pagetitle, "Automation Exercise");
		
		CommonMethods.verfiyPageTitle("Automation Exercise");
		
		CommonMethods.clickOnWebElement("SignUpLogIn_btn", "SignUpLogIn button");
		
		CommonMethods.verifyTextOnThePage("NewUsrSignUp_Txt", "New User Signup!");
		
		CommonMethods.enterTextIntoInputBox("name", "BYMAT");
		
		CommonMethods.enterTextIntoInputBox("signup-email", "bymat.test@bymatautomation.com", "email address");
		
		CommonMethods.clickOnWebElement("signup_btn", "SignUp button");
		
		CommonMethods.verifyTextOnThePage("pageText", "ENTER ACCOUNT INFORMATION");
		
		CommonMethods.clickOnWebElement("gender_Mr", "Mr. Radio Button");
		
		CommonMethods.enterTextIntoInputBox("pwd", "Test@1234", "Password entered");
		
		CommonMethods.selectByVisibleText("dd_Days", "5");
		
		CommonMethods.selectByVisibleText("dd_month", "May");
		
		CommonMethods.selectByVisibleText("dd_years", "199032342");
		
	}

}
