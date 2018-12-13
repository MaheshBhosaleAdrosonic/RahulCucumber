package StepDefinition;

import SeleniumPages.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefGoogleHomepage {
	
	GoogleHomePage objGoogleHomePage = new GoogleHomePage();

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Exception {

		objGoogleHomePage.initializeWebEnvirnoment();
		System.out.println("Launch Browser");
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Exception {
		objGoogleHomePage.openURLInBrowser();
		System.out.println("Open Google ");
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Exception {
		objGoogleHomePage.checkSearchBoxIsDisplayed();
		System.out.println("Check Search box");
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Exception {
		objGoogleHomePage.checkGoogleSearchButtonIsDisplayed();
		System.out.println("Check google search button");
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Exception {
		objGoogleHomePage.checkImFeelingLuckyButtonIsDisplayed();
		System.out.println("Check feeling lucky button");
	}

}
