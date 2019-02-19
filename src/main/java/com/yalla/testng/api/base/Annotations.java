package com.yalla.testng.api.base;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.yalla.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class Annotations extends SeleniumBase {

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	


	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}
	
	

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}

	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "username");
		clearAndType(eleUsername, "DemoSalesManager");
		//WebElement elePassword = locateElement("id", "password");
        clearAndType(locateElement("id", "password"), "crmsfa");       
        click(locateElement("class", "decorativeSubmit"));
        click(locateElement("link", "CRM/SFA"));
        
		
		
		
		
		
	}

	@AfterMethod	
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		
	}

	@AfterMethod
	public void afterMethod(){
		close();

	}
	

}
