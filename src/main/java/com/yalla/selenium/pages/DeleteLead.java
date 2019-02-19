package com.yalla.selenium.pages;

import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;


public class DeleteLead extends Annotations{

	
	public DeleteLead()
	{
		// pagefactory to initialize the webelement and finding the webelements to current page using -- this keyword 
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	
	
}
