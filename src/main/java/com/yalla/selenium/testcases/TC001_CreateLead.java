package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.CreateLead;
import com.yalla.selenium.pages.HomePage;
import com.yalla.selenium.pages.LoginPage;
import com.yalla.selenium.pages.MyHome;
import com.yalla.testng.api.base.Annotations;

public class TC001_CreateLead extends Annotations{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription = "CreateLead Positive";
		testNodes = "createLead";
		authors = "dharani";
		category = "Smoke";
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String companyName, String firstName,String lastName)
	{
		new MyHome()
		.ClickLead()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFfirstName(firstName)
		.enterLastName(lastName)
		
		.clickCreateLeadButton();
		
	}
	
	
}
