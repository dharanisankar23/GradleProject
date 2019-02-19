package hooks;

import org.openqa.selenium.WebElement;


import com.yalla.selenium.api.base.SeleniumBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RunHooks extends SeleniumBase{

	@Before
	public void before(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getId());
		test.assignCategory("smoke");
		test.assignAuthor("Dharani");		
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "username");
		clearAndType(eleUsername, "DemoSalesManager");
		//WebElement elePassword = locateElement("id", "password");
		clearAndType(locateElement("id", "password"), "crmsfa");       
		click(locateElement("class", "decorativeSubmit"));

	}
	@After
	public void after(Scenario sc)
	{
		close();
		endResult();
	}
}
