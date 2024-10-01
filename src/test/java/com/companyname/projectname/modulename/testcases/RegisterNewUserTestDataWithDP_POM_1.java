package com.companyname.projectname.modulename.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;

public class RegisterNewUserTestDataWithDP_POM_1 extends TestBase { // Business logic
	
	@BeforeClass
	public void getTestCaseName() {
		testCaseName = this.getClass().getSimpleName(); 
		if(!run_mode.get(testCaseName).equalsIgnoreCase("Y"))
			throw new SkipException("Skipping Test case as Run mode is set to No");
	}
	
	@Test(dataProvider = "data_Collection") // POM design pattern Framework 
	public void registerNewUserTestDataWithDP_POM_1(Hashtable<String, String> ht) {
		
//		HomePage hp = new HomePage();
//		hp.verifyHomePageTitle(ht);
//		hp.navigateToSignInOrSignUpPage();
//		
//		SignInOrSignUpPage signIn = new SignInOrSignUpPage();
//		
//		signIn.registerNewUser(ht);
		
		hp.verifyHomePageTitle(ht)
		.navigateToSignInOrSignUpPage()
		.registerNewUser(ht)
		.enterAccountInfo(ht)
		.enterAddress(ht);
		
//		CommonMethods.clickOnWebElement("SignUpLogIn_btn", "SignUpLogIn button");
//		
//		CommonMethods.verifyTextOnThePage("NewUsrSignUp_Txt", ht.get("Home_Page_Text"));
//		
//		CommonMethods.enterTextIntoInputBox("name", ht.get("First_Name"));
//		
//		CommonMethods.enterTextIntoInputBox("signup-email", ht.get("Email_Address"), "email address");
//		
//		CommonMethods.clickOnWebElement("signup_btn", "SignUp button");
		
//		CommonMethods.verifyTextOnThePage("pageText", ht.get("Accnt_Info_Page_Text"));
//		
//		CommonMethods.clickOnWebElement("gender_Mrs", "Mrs. Radio Button");
//		
//		CommonMethods.enterTextIntoInputBox("pwd", "Test@1234", "Password entered");
//		
//		CommonMethods.selectByVisibleText("dd_Days", ht.get("DOB_Days"));
//		
//		CommonMethods.selectByVisibleText("dd_month", ht.get("DOB_Month"));
//		
//		CommonMethods.selectByVisibleText("dd_years", ht.get("DOB_Year"));
		
	}
	
//	@DataProvider
//	public Object[][] data_Collection() {	
//		DataCollection dc = new DataCollection(excel, "Test_Data", "RegisterNewUserTestDataWithDP_POM");			
//		return dc.dataArray();	
//	}

}
