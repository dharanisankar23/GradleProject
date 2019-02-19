package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.When;

public class MyLead extends Annotations{

	
	public MyLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead") private WebElement eleCreateLead;
	@FindBy(how=How.LINK_TEXT, using="Find Leads") private WebElement eleFindLead;
	@FindBy(how=How.LINK_TEXT,using="Merge Leads") private WebElement eleMergeLead;
	
	@When("Click on Create Lead Button")
	public CreateLead clickCreateLead()
	{
		click(eleCreateLead);
		
		return new CreateLead();
	}
	public FindLead clickFindLead()
	{
		click(eleFindLead);
		return new FindLead();
	}
	public MergeLead clickMergeLead()
	{
		click(eleMergeLead);
		
		return new MergeLead();
	}
}
