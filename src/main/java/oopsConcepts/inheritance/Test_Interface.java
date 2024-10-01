package oopsConcepts.inheritance;

import interface_test.ChromeDriver_BYMAT;
import interface_test.EdgeDriver_BYMAT;
import interface_test.FirefoxDriver_BYMAT;

import interface_test.WebDriver_Bymat;

public class Test_Interface {
	
	public static WebDriver_Bymat driver;
	
	public static void main(String[] args) {
		
		//EdgeDriver_BYMAT driver = new EdgeDriver_BYMAT();
		
		//FirefoxDriver_BYMAT driver = new FirefoxDriver_BYMAT();
		
	//	FirefoxDriver_BYMAT driver = new ChromeDriver_BYMAT();
		
		if("Browser".equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver_BYMAT();
			System.out.println("Chrome Driver is launched");
		} else if("Browser".equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver_BYMAT();
		} else {		
			driver = new EdgeDriver_BYMAT();
		}
		
		driver.get("https//google.com");
		driver.getText();
		driver.quit();
		driver.close();
		driver.click();
		driver.getTitle();
	}

}
