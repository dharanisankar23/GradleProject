package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class LoginPage extends Annotations {

	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID, using="username") private WebElement eleUname;
	@FindBy(how=How.ID, using="password") private WebElement elePassword;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") private WebElement eleLoginButton;
	//@FindBy(how=How.XPATH, using="//div[@id='errorDiv']//p[2]") private WebElement eleVerifyWarning;
	@FindBy(how=How.XPATH, using="//div[@id='errorDiv']") private WebElement eleVerifyWarning;
	//@FindBy(how=How.XPATH, using="//p[contains(text(),'username was empty reenter')]") private WebElement eleVerifyusername;
	
	public LoginPage enterUserName(String username)
	{
		// taken username value from excel sheet
		clearAndType(eleUname,username);
		
		return this;
		
	}
	
	public LoginPage enterPassword(String password)
	{
		// taken password value from excel sheet
		clearAndType(elePassword, password);
		return  this;
		
	}
	
	public LoginPage verifyLoginPageErrors(String data)
	{
		
		verifyPartialText(eleVerifyWarning, data);
		return this;
				
		
	}
	public LoginPage clickLogin()
	{
		
		click(eleLoginButton);	
		
		return this; 
	}
	
	public MyHome clickLoginButton()
	{
		
		click(eleLoginButton);	
		
		return new MyHome(); 
	}
	
}
