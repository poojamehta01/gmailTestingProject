
package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = "@sendMail", features = "src/test/java/features/", glue = "com.automation.steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}
