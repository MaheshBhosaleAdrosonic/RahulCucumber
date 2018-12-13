package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature/MultiplePassing.feature" , glue = "StepDefinition" ,
plugin = "usage" , monochrome = true )
public class AutomationPracticeRunner {

}
