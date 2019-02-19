package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MergeLead extends Annotations {

	
	public MergeLead()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH , using="(//img[@alt='Lookup'])[1]"	) private WebElement eleFromLead;
	
	@FindBy(how=How.XPATH , using="(//img[@alt='Lookup'])[2]"	) private WebElement eleToLead;
	@FindBy(how=How.XPATH  , using="//a[text()='Merge']"	) private WebElement eleMergeButton;
	@FindBy(how=How.XPATH  , using="//input[@id='ComboBox_partyIdFrom']") private  WebElement eleMergeLeadId;
	public static String mergeFromLeadId="";
	public NewWndowFindLead findfromLeadId()
	{
		click(eleFromLead);
		
		switchToWindow(1);
		return new NewWndowFindLead();
		
		
	}
	public NewWndowFindLead findToLeadId()
	{
		mergeFromLeadId= eleMergeLeadId.getAttribute("value");
		click(eleToLead);
		switchToWindow(1);
		return new NewWndowFindLead();
	}
	
	/*public NewWndowFindLead switchToWindowByIndex(int index)
	{
		switchToWindow(index);
		
		return new NewWndowFindLead();
	}*/
	
	public MergeLead clickMergeButton()
	{
		click(eleMergeButton);
		acceptAlert();
		return this;
		
	}
	
	/*public  MergeLead findfirstLeadId()
	{
		mergeFromLeadId = 
		
		return this;
	}
	*/
	
	
	/*public MergeLead dismissAlertWindow()
	{
		
		dismissAlert();
		defaultContent();
		return this;
	}*/
}
