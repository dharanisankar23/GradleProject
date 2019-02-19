package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class MyHome extends Annotations {

	public MyHome()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how= How.LINK_TEXT, using="Leads") private WebElement eleLead;
	
	@And("click on Lead") 
	public MyLead ClickLead()
	{
		click(eleLead);
		
		return new MyLead();
		
	}
	
	
	
	
}
