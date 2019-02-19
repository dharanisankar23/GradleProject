package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZoomSteps {
	public static ChromeDriver driver;
	@Given("Launch the browser")
	public void launchTheBrowser() {
	   driver=new ChromeDriver();
	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
	   driver.manage().window().maximize();
	}

	@Given("set the timeout")
	public void setTheTimeout() {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Load the url")
	public void loadTheUrl() {
	   driver.get("https://www.zoomcar.com/chennai/");
	}

	@When("click on the Start your wonderful journey")
	public void clickOnTheStartYourWonderfulJourney() {
	    driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
	}

	@Then("Title should contains Book a car in Chennai")
	public void titleShouldContainsBookACarInChennai() {
	    if(driver.getTitle().contains("Book A Car In Chennai"))
	    		{
	    			System.out.println("title is matched " );
	    		}
	    else
	    {
	    	System.out.println("title not matched " );
	    }
	    	
	}

	@And("click on the Thuraipakkam")
	public void clickOnTheThuraipakkam() {
	    driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
	}

	@When("click on the NextButton")
	public void clickOnTheNextButton() {
	    driver.findElementByXPath("//button[text()='Next']").click();
	}
}
