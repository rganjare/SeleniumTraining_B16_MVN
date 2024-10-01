package com.companyname.projectname.modulename.testcases;

import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class RegisterNewUserTestData extends TestBase { // Business logic
	
	@Test
	public void registerNewUserTestData() {
		
	//	String pagetitle = driver.getTitle();
	//	Assert.assertEquals(pagetitle, "Automation Exercise");
		
		//CommonMethods.verfiyPageTitle("Automation Exercise");
		CommonMethods.verfiyPageTitle(excel.getCellData("Test_Data", "Page_Title", 2));
		
		CommonMethods.clickOnWebElement("SignUpLogIn_btn", "SignUpLogIn button");
		
		CommonMethods.verifyTextOnThePage("NewUsrSignUp_Txt", excel.getCellData("Test_Data", "Home_Page_Text", 2));
		
		CommonMethods.enterTextIntoInputBox("name", excel.getCellData("Test_Data", "First_Name", 2));
		
		CommonMethods.enterTextIntoInputBox("signup-email", excel.getCellData("Test_Data", "Email_Address", 2), "email address");
		
		CommonMethods.clickOnWebElement("signup_btn", "SignUp button");
		
		CommonMethods.verifyTextOnThePage("pageText", excel.getCellData("Test_Data", "Accnt_Info_Page_Text", 2));
		
		CommonMethods.clickOnWebElement("gender_Mrs", "Mrs. Radio Button");
		
		CommonMethods.enterTextIntoInputBox("pwd", "Test@1234", "Password entered");
		
		CommonMethods.selectByVisibleText("dd_Days", excel.getCellData("Test_Data", "DOB_Days", 2));
		
		CommonMethods.selectByVisibleText("dd_month", excel.getCellData("Test_Data", "DOB_Month", 2));
		
		CommonMethods.selectByVisibleText("dd_years", excel.getCellData("Test_Data", "DOB_Year", 2));
		
	}

}
