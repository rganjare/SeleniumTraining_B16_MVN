package com.companyname.projectname.modulename.rough;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//Xpaths -- a concept of Page Factory in POM framework
//	@FindBy(name = "")
//	@FindBy(id = "")
//	@FindBy(className = "")
//	@FindBy(linkText = "")
//	@FindBy(partialLinkText = "")
//	@FindBy(css = "")
		
	@FindBy(xpath = "//*[text()=\" Signup / Login\"]")
	private static WebElement SignUpLogIn_btn;

	@FindBy(xpath = "//*[text()=\"New User Signup!\"]")
	private static WebElement NewUsrSignUp_Txt;

	@FindBy(xpath = "//*[@name=\"name\"]")
	private static WebElement name;

	@FindBy(xpath = "//*[@name=\"email\"][@data-qa=\"signup-email\"]")
	private static WebElement signup_email;

	@FindBy(xpath = "//*[@data-qa=\"signup-button\"]")
	private static WebElement signup_btn;

	public Accnt_Info_Page registerNewUser(Hashtable<String, String> ht) {

		CommonMethods.verfiyPageTitle(ht.get("Page_Title"));

		CommonMethods.clickOnWebElement(SignUpLogIn_btn, "SignUpLogIn button");

		CommonMethods.verifyTextOnThePage(NewUsrSignUp_Txt, ht.get("Home_Page_Text"));

		CommonMethods.enterTextIntoInputBox(name, ht.get("First_Name"));

		CommonMethods.enterTextIntoInputBox(signup_email, ht.get("Email_Address"), "email address");

		CommonMethods.clickOnWebElement(signup_btn, "SignUp button");
		
		return new Accnt_Info_Page();

	}

}
