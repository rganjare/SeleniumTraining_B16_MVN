package com.companyname.projectname.modulename.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.companyname.projectname.modulename.pages.HomePage;
import com.companyname.projectname.modulename.utilities.DataCollection;
import com.companyname.projectname.modulename.utilities.ExcelReader;

public class TestBase { // Heart/Engine of Framework
	
	public static WebDriver driver;  // Interface 
	public static Properties config;
	public static Properties or;
	
	public static ExtentSparkReporter spark; // Global variables
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static ExcelReader excel;
	
	public static String testCaseName;
	
	public static Hashtable<String, String> run_mode = new Hashtable<>();
	
	public static HomePage hp;
	
	@BeforeSuite // only once for my complete Test suite (40/ 250/ 400 Test cases)
	public void loadPropFiles() throws IOException {
		System.out.println("Reading config file");
		//FileInputStream fis = new FileInputStream("D:\\BYMAT_Automation\\WorkSpace\\Selenium_Training_B16"
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\files\\config.properties");
		config = new Properties();
		config.load(fis); // Local variable
		System.out.println("Config file is loaded");
		//System.out.println(config.getProperty("Browser"));
		  
		System.out.println("Reading OR file");
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") 
				+"\\src\\test\\resources\\files\\OR.properties");
		or = new Properties();
		or.load(fis1);
		//System.out.println(or.getProperty("custID"));
		System.out.println("OR file is loaded");
		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executionReports\\report_"+timeStamp+".html");
		report.attachReporter(spark);
		
		excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Test_Data_Sheet.xlsx");
	
		readRunMode();
		
	}
	
	@BeforeMethod //25
	public void launchBrowser() {
		test = report.createTest(testCaseName);
		
		if(config.getProperty("Browser").equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			System.out.println("Chrome Driver is launched");
			test.info("Chrome Driver is launched");
		} else if(config.getProperty("Browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			test.info("FirefoxDriver is launched");
		} else {		
			driver = new EdgeDriver();
			test.info("EdgeDriver is launched");
		}
		driver.manage().window().maximize();	// Selenium is design and develop in POM design pattern
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 1 to 10 sec
		
		if(config.getProperty("Envt").equalsIgnoreCase("Test")) {
			driver.get(config.getProperty("AppURL_test"));
			test.info("User navigated to application URL:  "+config.getProperty("AppURL_test"));
		} else if(config.getProperty("Envt").equalsIgnoreCase("UAT")) {
			driver.get(config.getProperty("AppURL_uat"));
			test.info("User navigated to application URL:  "+config.getProperty("AppURL_test"));
		} else {		
			driver.get(config.getProperty("AppURL")); // Test
			test.info("User navigated to application URL:  "+config.getProperty("AppURL_test"));
		}	
		
		hp = new HomePage();
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException { //CloseBrowser
		 Thread.sleep(5000);
		driver.quit();
	}
	
	@AfterSuite
	public void generateReport() {
		//report.removeTest(test);
		report.flush();
	}
	
	@DataProvider
	public Object[][] data_Collection() {	
		DataCollection dc = new DataCollection(excel, "Test_Data", testCaseName);			
		return dc.dataArray();	
	}
	
	public void readRunMode() {
		
		int rows = excel.getRowCount("Test_Cases");
		System.out.println("rows count: " +rows);
	
		for(int i = 2; i<=rows ; i++) {
		
		String key = excel.getCellData("Test_Cases", "Test_Case_Name", i);
		
		String value = excel.getCellData("Test_Cases", "Run_Mode", i);
		
		run_mode.put(key, value);
		
		}
		
		System.out.println("HashTable Run Mode :- " +run_mode);
		
	}

}
