package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/DataDrivenTest.feature", glue="StepDefinition")

public class CucumberDataDrivenTestRunner {

}
