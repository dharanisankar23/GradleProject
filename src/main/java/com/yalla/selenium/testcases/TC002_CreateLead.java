package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.HomePage;
import com.yalla.selenium.pages.MyHome;
import com.yalla.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription = "CreateLead Negative";
		testNodes = "createLead ";
		authors = "dharani";
		category = "Smoke";
		excelFileName = "CreateLeadNegative";
	}
	
	@Test(dataProvider="fetchData")
	
	public void createLeadNegativeCase(String companyName,String firstName,String lastName,String expectedresult)
	{
		new MyHome()
		.ClickLead()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFfirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadNegative(expectedresult);
		
		
		
	}
	
	
	
}
