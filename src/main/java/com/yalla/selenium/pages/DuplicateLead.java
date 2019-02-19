package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class DuplicateLead extends Annotations{

	
	public DuplicateLead()
	{
		// pagefactory to initialize the webelement and finding the webelements to current page using -- this keyword 
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit") private WebElement eleCreateLeadButton;
	
	public ViewLead clickCreateLead()
	{
		click(eleCreateLeadButton);
		
		return new ViewLead();
	}
	
	
}
