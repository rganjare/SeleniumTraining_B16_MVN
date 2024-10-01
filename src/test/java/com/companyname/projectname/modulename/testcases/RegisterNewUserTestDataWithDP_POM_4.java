package com.companyname.projectname.modulename.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.companyname.projectname.modulename.testbase.TestBase;

public class RegisterNewUserTestDataWithDP_POM_4 extends TestBase { // Business logic
	
	@BeforeClass
	public void getTestCaseName() {
		testCaseName = this.getClass().getSimpleName(); 
		if(!run_mode.get(testCaseName).equalsIgnoreCase("Y"))
			throw new SkipException("Skipping Test case as Run mode is set to No");
	}
	
	@Test(dataProvider = "data_Collection") // POM design pattern Framework 
	public void registerNewUserTestDataWithDP_POM_4(Hashtable<String, String> ht) {
	
		hp.verifyHomePageTitle(ht)
		.navigateToSignInOrSignUpPage()
		.registerNewUser(ht)
		.enterAccountInfo(ht)
		.enterAddress(ht);
		
	}
	

}
