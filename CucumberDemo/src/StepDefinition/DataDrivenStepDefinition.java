package StepDefinition;

import SeleniumPages.GoogleHomePage;
import cucumber.api.java.en.Then;

public class DataDrivenStepDefinition {

	GoogleHomePage objGoogleHomePage = new GoogleHomePage();
	
	@Then("^I search for \"([^\"]*)\" on Google$")
	public void i_search_for_on_Google(String searchKeyword) throws Exception {
	   
		objGoogleHomePage.searchOnGoogleHomepage(searchKeyword);
	}
}
