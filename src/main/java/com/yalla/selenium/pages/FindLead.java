package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class FindLead extends Annotations{

	
	public FindLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']") private WebElement eleLeadId;
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]") private WebElement elefirstName;
	
	@FindBy(how=How.XPATH, using="(//input[@name='lastName'])[3]") private WebElement eleLastName;
	
	@FindBy(how=How.XPATH, using="(//input[@name='companyName'])[2])") private WebElement eleCompName;
	
	@FindBy(how=How.XPATH, using="//input[@name='phoneNumber']") private WebElement elePhoneNo;
	
	@FindBy(how=How.XPATH, using="(//div[@class='x-tab-panel-bwrap']//input)[5]") private WebElement eleEmail;
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") private WebElement elefindLead;
	
	//@FindBy(how=How.XPATH, using="//table[@class='x-grid3-row-table']/tbody/tr/td[1]")private List<WebElement> eleLeadIds;
	
	@FindBy(how=How.XPATH, using="(//table[@class='x-grid3-row-table']/tbody/tr/td)[1]")private WebElement eleFirstLink;
	
	@FindBy(how=How.CLASS_NAME, using="x-paging-info")private WebElement eleLeadNoRecordId;
	public FindLead enterLeadId(String leadId)
	{
		clearAndType(eleLeadId, leadId);
		
		return this;
	}
	public FindLead enterFirstName(String firstName)
	{
		clearAndType(elefirstName, firstName);
		return this;
	}
	
	public FindLead enterLastName(String lastName)
	{
		clearAndType(eleLastName, lastName);
		return this;
	}
	
	public FindLead enterCompanyName(String CompanyName)
	{
		clearAndType(eleCompName, CompanyName);
		return this;
	}
	
	public FindLead enterPhoneNumber(String phoneNo)
	{
		clearAndType(elePhoneNo, phoneNo);
		return this;
	}
	
	public FindLead enterEmailAddress(String emailAddress)
	{
		
		clearAndType(eleEmail, emailAddress);
		return this;
	}
	
	public FindLead clickFindLeadButton()
	{
		click(elefindLead);
		return this;
	}
	
	/*public void getLeadoptions()
	{
		locateElements();
	}*/
	
	public ViewLead ClickFirstLink()
	{
		click(eleFirstLink);
		return new ViewLead();
	}
	
	public void verifyLeadIdAfterMerge(String text)
	{
		
		//clearAndType(eleLeadId, NewWndowFindLead.fromLeadId);
		
		verifyPartialText(eleLeadNoRecordId, text);
	}
	
	
	
}
