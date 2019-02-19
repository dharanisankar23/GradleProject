package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.HomePage;
import com.yalla.selenium.pages.MergeLead;
import com.yalla.selenium.pages.MyLead;
import com.yalla.selenium.pages.NewWndowFindLead;
import com.yalla.testng.api.base.Annotations;

public class TC001_MergeLead extends Annotations{

	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_MergeLead";
		testDescription = "MergeLead Positive";
		testNodes = "MergeLead";
		authors = "dharani";
		category = "Smoke";
		excelFileName = "mergeLeadid";
	}
	
	@Test(dataProvider="fetchData")
	public void mergepositiveTestCase(String fromFirstName,String toFirstName, String expectedtext  ) throws InterruptedException
	{
		new HomePage()
		.ClickCrmSFa()
		.ClickLead()
		.clickMergeLead()
		.findfromLeadId()
		.enterFirstName(fromFirstName)
		.clickFindLeadButton()
		.ClickFirstLink()
		.findToLeadId()
		.enterFirstName(toFirstName)
		.clickFindLeadButton()
		.ClickFirstLink()
		.clickMergeButton();
		
		new MyLead()
		.clickFindLead()
		.enterLeadId(MergeLead.mergeFromLeadId)
		.clickFindLeadButton()
		.verifyLeadIdAfterMerge(expectedtext);
		
		
		
	}
	
	
}
