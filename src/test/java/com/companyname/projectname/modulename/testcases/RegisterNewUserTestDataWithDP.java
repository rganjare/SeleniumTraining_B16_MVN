package com.companyname.projectname.modulename.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class RegisterNewUserTestDataWithDP extends TestBase { // Business logic
	
	@BeforeClass
	public void getTestCaseName() {
		testCaseName = this.getClass().getSimpleName(); 
		
		if(!run_mode.get(testCaseName).equalsIgnoreCase("Y"))
			throw new SkipException("Skipping Test case as Run mode is set to No");
	}
	
	@Test(dataProvider ="data_Collection") // Data Driven framework Test case
	public void registerNewUserTestDataWithDP(Hashtable<String, String> ht) {
		
		CommonMethods.verfiyPageTitle(ht.get("Page_Title"));
		
		CommonMethods.clickOnWebElement("SignUpLogIn_btn", "SignUpLogIn button");
		
		CommonMethods.verifyTextOnThePage("NewUsrSignUp_Txt", ht.get("Home_Page_Text"));
		
		CommonMethods.enterTextIntoInputBox("name", ht.get("First_Name"));
		
		CommonMethods.enterTextIntoInputBox("signup-email", ht.get("Email_Address"), "email address");
		
		CommonMethods.clickOnWebElement("signup_btn", "SignUp button");
		
		CommonMethods.verifyTextOnThePage("pageText", ht.get("Accnt_Info_Page_Text"));
		
		CommonMethods.clickOnWebElement("gender_Mrs", "Mrs. Radio Button");
		
		CommonMethods.enterTextIntoInputBox("pwd", "Test@1234", "Password entered");
		
		CommonMethods.selectByVisibleText("dd_Days", ht.get("DOB_Days"));
		
		CommonMethods.selectByVisibleText("dd_month", ht.get("DOB_Month"));
		
		CommonMethods.selectByVisibleText("dd_years", ht.get("DOB_Year"));
		
	}
	
//	@DataProvider
//	public Object[][] data_Collection() {	
//		DataCollection dc = new DataCollection(excel, "Test_Data", "RegisterNewUserTestDataWithDP");			
//		return dc.dataArray();	
//	}

}
