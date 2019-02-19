package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.yalla.selenium.pages.HomePage;
import com.yalla.selenium.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_LoginAndLogout extends Annotations{

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_LoginAndLogout";
		testDescription = "Login Negative";
		testNodes = "Login Negative";
		authors = "dharani";
		category = "Sanity";
		excelFileName = "LoginNagitive";
	}
	@Test(dataProvider="fetchData")
	public void loginNegativeCase(String username, String password, String data) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin().verifyLoginPageErrors(data);
		
		
		 
		// Another way 
		/*LoginPage page = new LoginPage();
		page.enterUserName(username);
		page.enterPassword(password);
		page.clickLoginButton();*/
		
	}
}








