package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin= {"html:target/cucumberreport.html"},
		features="src/test/java/features/VoltasLogin.feature",
		glue="StepDefinitions")

public class Runner {
	

}
