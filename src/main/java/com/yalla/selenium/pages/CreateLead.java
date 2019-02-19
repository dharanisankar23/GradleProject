package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;


public class CreateLead extends Annotations{

	public CreateLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") private WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") private WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") private WebElement eleLastName;
	@FindBy(how=How.ID, using="createLeadForm_dataSourceId") private WebElement eleSource;
	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId") private WebElement eleMarketingCampaign;
	
	
	
	@FindBy(how=How.ID, using="createLeadForm_firstNameLocal") private WebElement eleFirstNameLocal;
	/*
	@FindBy(how=How.ID, using="createLeadForm_lastNameLocal") private WebElement eleLastNameLocal;
	@FindBy(how=How.ID, using="createLeadForm_personalTitle") private WebElement elepersonalTitle;*/
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit") private WebElement eleCreateLeadButton;
	@FindBy(how=How.XPATH,using="//ul[@class='errorList']") private WebElement eleverifyCreateLeadWarning;
	
	@Then("Enter the Company Name (.*)")
	public CreateLead enterCompanyName(String companyName)
	{
		clearAndType(eleCompanyName, companyName);
		
		return this;
	}
	@And("Enter the First Name(.*)")
	public CreateLead enterFfirstName(String firstName )
	{
		clearAndType(eleFirstName, firstName);
		
		return this;
	}
	@And("Enter the Last Name(.*)")
	public CreateLead enterLastName(String lastName)
	{
		clearAndType(eleLastName, lastName);
		
		return this;
	}
	
	/*public CreateLead SelectSource(String typeOfValue,String value)
	{
		switch(typeOfValue)
		{
		case "index": selectDropDownUsingIndex(eleSource, Integer.parseInt(value));
		break;
		case "value": selectDropDownUsingValue(eleSource, value);
		break;
		
		case "text" : selectDropDownUsingText(eleSource, value);
		break;
		}
				
		return this;
	}*/
	
	
	public CreateLead selectSouceByIndex(int value)
	{
		selectDropDownUsingIndex(eleSource, value);
		return this;
	}
	
	public CreateLead selectSouceByValue(String value)
	{
		
		selectDropDownUsingValue(eleSource, value);
		
		return this;
	}
	
	public CreateLead selectSouceByVisibleText(String value)
	{
		
		selectDropDownUsingText(eleSource, value);
		
		return this;
	}
	
	
	
	public CreateLead selectMarketingCampByIndex(int value)
	{
		selectDropDownUsingIndex(eleSource, value);
		return this;
	}
	
	public CreateLead selectMarketingCampByValue(String value)
	{
		
		selectDropDownUsingValue(eleSource, value);
		
		return this;
	}
	
	public CreateLead selectMarketingCampByVisibleText(String value)
	{
		
		selectDropDownUsingText(eleSource, value);
		
		return this;
	}
	
	public CreateLead enterFirstNameLocal(String firstNameLocal)
	{
		clearAndType(eleFirstNameLocal, firstNameLocal);
		return this;
	}
	
	@Then("click on Create Lead Button") 
	public ViewLead clickCreateLeadButton()
	{
		click(eleCreateLeadButton);
		
		return new ViewLead();
	}
	@But("without mandatory click on Create Lead Button(.*)")
	public CreateLead clickCreateLeadNegative(String text)
	{
		click(eleCreateLeadButton);
		
		verifyPartialText(eleverifyCreateLeadWarning, text);
		
		return this;
	}
	
}
