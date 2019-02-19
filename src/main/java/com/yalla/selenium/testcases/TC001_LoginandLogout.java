package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC001_LoginandLogout extends Annotations{
	
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogout";
		testDescription = "Login Positive";
		testNodes = "Login";
		authors = "dharani";
		category = "Smoke";
		excelFileName = "TC001";
		
		
	}
	@Test(dataProvider="fetchData")
	public void loginPossitiveCase(String userName,String password)

	{
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
		
		
	}
	
}
