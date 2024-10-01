package com.companyname.projectname.modulename.rough;

import com.companyname.projectname.modulename.utilities.ExcelReader;

public class Excel_Reading {
	
	public static void main(String[] args) {
		
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Test_Data_Sheet.xlsx");
		
//		excel.addSheet("Test_Cases");
//		
//		System.out.println(excel.addColumn("Test_Cases", "Test_Case_Name"));
//		System.out.println(excel.addColumn("Test_Cases", "Run_Mode"));
//		System.out.println(excel.addColumn("Test_Cases", "Testing_Type"));
//		System.out.println(excel.addColumn("Test_Cases", "Status"));
//		
		//System.out.println(excel.addSheet("Test_Data"));
//		
//		System.out.println(excel.addColumn("Test_Data", "First_Name"));
//		System.out.println(excel.addColumn("Test_Data", "Last_Name"));
//		System.out.println(excel.addColumn("Test_Data", "Email_Address"));
//		System.out.println(excel.addColumn("Test_Data", "Mobile_no"));
//		System.out.println(excel.addColumn("Test_Data", "Address"));
//		System.out.println(excel.addColumn("Test_Data", "City"));
//		System.out.println(excel.addColumn("Test_Data", "Pin_Code"));
		
//		excel.setCellData("Test_Data", "Email_Address", 6, "Akshay_test@gmail.com");
//		excel.setCellData("Test_Data", "Mobile_no", 6, "5345354353");
//		
//		System.out.println(excel.getCellData("Test_Data", "First_Name", 4));
//		System.out.println(excel.getCellData("Test_Data", "Last_Name", 4));
//		System.out.println(excel.getCellData("Test_Data", "Email_Address", 4));
//		System.out.println(excel.getCellData("Test_Data", "Mobile_no", 4));
		
		System.out.println(excel.getColumnCount("Test_Data"));
		
		
		
	}

}
