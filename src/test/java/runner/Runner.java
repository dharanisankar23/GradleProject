package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


// Cucumber.class-- class all methods will invocated 
@RunWith(Cucumber.class)


/*dryRun=true -- application will not invocated (to check all method are implemented correct or not )
snippetType - Enum class 

SnippertType.CAMELCASE - all methods will displayed camel case in console
tags-- particular scenario will run [use : and , or, not (~)]

*/

@CucumberOptions(features= "src/test/java/features/CreateLead.feature",
            glue= {"com.yalla.selenium.pages","hooks"},
			dryRun=false, snippets=SnippetType.CAMELCASE, monochrome=true)
public class Runner {

	
}
