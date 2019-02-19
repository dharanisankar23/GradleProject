package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static ChromeDriver driver;
	
	public void setUpTheUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://leaftaps.com/opentaps/");
	}
	
	public void enterTheUserName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");

	}
	
	public void enterThePasswrodName()
	{
		driver.findElementById("password").sendKeys("crmsfa");

	}

	public void clickOnLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}

	
	public void clickOnCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	
	public void clickOnLead() {
		driver.findElementByLinkText("Leads").click();
	}

	
	public void clickOnCreateLeadButton1() {
		driver.findElementByLinkText("Create Lead").click();
	}


	public void enterTheCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}

	
	public void enterTheFirstName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	}

	
	public void enterTheLastName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	}
	/*@And ("select birthday date")
	public void selectBirthdayDate()
	{
		String presentMonth = driver.findElementByXPath("//div[@class='calendar']/table/thead/tr/td[2]").getText();

	}*/
	
	public void clickOnCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}

}
