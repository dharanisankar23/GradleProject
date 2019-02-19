package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.When;

public class HomePage extends Annotations {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") private WebElement eleLogOutButton;
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") private WebElement eleCrmSfa;
	
	public LoginPage ClickLogOutButton()
	{
		click(eleLogOutButton);
		return new LoginPage();
		
	}
	@When("click on CRM") 
	public MyHome ClickCrmSFa()
	{
		click(eleCrmSfa);
		
		return new MyHome();
	}
	
	
}
