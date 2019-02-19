package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yalla.testng.api.base.Annotations;

public class NewWndowFindLead extends Annotations{

	public NewWndowFindLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']") private WebElement eleLeadId;
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])") private WebElement elefirstName;
	
			
	@FindBy(how=How.XPATH, using="(//input[@name='lastName'])") private WebElement eleLastName;

	@FindBy(how=How.XPATH, using="//input[@name='companyName']") private WebElement eleCompName;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") private WebElement elefindLead;
	@FindBy(how=How.XPATH, using="(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")private WebElement eleFirstLink;
	
	
	public NewWndowFindLead enterLeadId(String leadId)
	{
		clearAndType(eleLeadId, leadId);
		
		return this;
	}
	public NewWndowFindLead enterFirstName(String firstName)
	{
		clearAndType(elefirstName, firstName);
		return this;
	}
	
	public NewWndowFindLead enterLastName(String lastName)
	{
		clearAndType(eleLastName, lastName);
		return this;
	}
	
	public NewWndowFindLead enterCompanyName(String CompanyName)
	{
		clearAndType(eleCompName, CompanyName);
		return this;
	}
	public NewWndowFindLead clickFindLeadButton() throws InterruptedException
	{
		click(elefindLead);
		Thread.sleep(3000);
		return this;
	}
	
	public MergeLead ClickFirstLink() throws InterruptedException
	{
		/*WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(eleFirstLink));*/
			
		
		click(eleFirstLink);
		switchToWindow(0);
		
		return new MergeLead();
	}
	
	
}
