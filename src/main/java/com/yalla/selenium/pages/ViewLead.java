package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLead extends Annotations{

	public ViewLead()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Edit") private WebElement eleEdit;
	@FindBy(how=How.LINK_TEXT, using="Duplicate Lead") private WebElement eleDuplicateLead;
	@FindBy(how=How.XPATH, using="//a[text()='Delete']") private WebElement eleDeleteLead;
	
	
	
	public EditLead clickEdit()
	{
		click(eleEdit);
		return new EditLead();
	}
	public DuplicateLead clickDuplicateLead()
	{
		click(eleDuplicateLead);
		return new DuplicateLead();
	}
	
	public MyLead clickDeleteLead()
	{
		click(eleDeleteLead);
		return new MyLead();
		
		
	}
	
	
}
