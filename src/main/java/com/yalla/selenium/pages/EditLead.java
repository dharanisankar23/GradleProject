package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class EditLead extends Annotations{

	
	public EditLead()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//@FindBy(how=How.LINK_TEXT, using="Edit") private WebElement eleEdit;
	@FindBy(how=How.ID,using="updateLeadForm_companyName") private WebElement eleChangeCompName;
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName") private WebElement eleChangeFirstName;
	
	@FindBy(how=How.NAME,using="submitButton") private WebElement eleUpdate;
	public EditLead changeCompanyName(String companyName)
	{
		clearAndType(eleChangeCompName, companyName);
		
		return this;
	}
	
	public EditLead changeFirstName(String firstName)
	{
		clearAndType(eleChangeFirstName, firstName);
		
		return this;
	}
	public ViewLead clickUpdateButton()
	{
		click(eleUpdate);
		return new ViewLead();
	}
}
