package com.companyname.projectname.modulename.rough;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class Accnt_Info_Page extends TestBase {
	
	public Accnt_Info_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=\"Enter Account Information\"]")
	private static WebElement pageText;

	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private static WebElement gender_Mr;

	@FindBy(xpath = "//*[@id=\"id_gender2\"]")
	private static WebElement gender_Mrs;

	@FindBy(xpath = "//*[@id=\"password\"]")
	private static WebElement pwd;

	@FindBy(xpath = "//*[@id=\"days\"]")
	private static WebElement dd_Days;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private static WebElement dd_month;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private static WebElement dd_years;

	public void enterPersonalInfo(Hashtable<String, String> ht) {
		
		CommonMethods.verifyTextOnThePage(pageText, ht.get("Accnt_Info_Page_Text"));
		
		CommonMethods.clickOnWebElement(gender_Mrs, "Mrs. Radio Button");
		
		CommonMethods.enterTextIntoInputBox(pwd, "Test@1234", "Password entered");
		
		CommonMethods.selectByVisibleText(dd_Days, ht.get("DOB_Days"));
		
		CommonMethods.selectByVisibleText(dd_month, ht.get("DOB_Month"));
		
		CommonMethods.selectByVisibleText(dd_years, ht.get("DOB_Year"));
		
	}
	
}
