package Workshop.BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resource", format = {"html:target/site/cucumber-pretty",
"json:target//surefire//cucumber.json"}, tags ="@Reg")

public class CucumberTest {
	
}
