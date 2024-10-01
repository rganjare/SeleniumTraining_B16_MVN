package com.companyname.projectname.modulename.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.projectname.modulename.testbase.TestBase;
import com.companyname.projectname.modulename.utilities.CommonMethods;

public class EnterAccntInfoPage extends TestBase {
	
	public EnterAccntInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=\"Enter Account Information\"]")
	private WebElement pageText;
	
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	private WebElement gender_Mr;
	
	@FindBy(xpath="//*[@id=\"id_gender2\"]")
	private WebElement gender_Mrs;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"days\"]")
	private WebElement dd_Days;
	
	@FindBy(xpath="//*[@id=\"months\"]")
	private WebElement dd_month;
	
	@FindBy(xpath="//*[@id=\"years\"]")
	private WebElement dd_years;
	
	
	public EnterAccntInfoPage enterAccountInfo(Hashtable<String, String> ht) {
		
		CommonMethods.verifyTextOnThePage(pageText, ht.get("Accnt_Info_Page_Text"));
		
		CommonMethods.clickOnWebElement(gender_Mrs, "Mrs. Radio Button");
		
		CommonMethods.enterTextIntoInputBox(pwd, config.getProperty("password"), "Password entered");
		
		CommonMethods.selectByVisibleText(dd_Days, ht.get("DOB_Days"));
		
		CommonMethods.selectByVisibleText(dd_month, ht.get("DOB_Month"));
		
		CommonMethods.selectByVisibleText(dd_years, ht.get("DOB_Year"));
		
		return this;
		
	}
	
	public HomePage enterAddress(Hashtable<String, String> ht) {
		
//		CommonMethods.verifyTextOnThePage(pageText, ht.get("Accnt_Info_Page_Text"));
//		
//		CommonMethods.clickOnWebElement(gender_Mrs, "Mrs. Radio Button");
//		
//		CommonMethods.enterTextIntoInputBox(pwd, config.getProperty("password"), "Password entered");
//		
//		CommonMethods.selectByVisibleText(dd_Days, ht.get("DOB_Days"));
//		
//		CommonMethods.selectByVisibleText(dd_month, ht.get("DOB_Month"));
//		
//		CommonMethods.selectByVisibleText(dd_years, ht.get("DOB_Year"));
//		
		System.out.println("Code to enter address details");
		
//		CommonMethods.clickOnWebElement(dd_years, ht.get("DOB_Year"));
		
		return new HomePage();
	}
	
	

}
