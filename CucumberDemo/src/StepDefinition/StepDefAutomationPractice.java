package StepDefinition;

import java.util.List;
import java.util.Map;

import SeleniumPages.AutomationPractice;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefAutomationPractice {

	AutomationPractice objAutomationPractice = new AutomationPractice();
	
	@Given("^I open my application$")
	public void i_open_my_application() throws Exception {
		objAutomationPractice.initializeWebEnvirnoment();
		objAutomationPractice.openURLInBrowser();
	}

	/** Without Header of Data Table */
	@When("^I login with following credentials$")
	public void i_login_with_following_credentials(DataTable dt) throws Throwable {

		List<String> list = dt.asList(String.class);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));
		objAutomationPractice.loginIntoApplication(list.get(0), list.get(1));
	}

	/** With Header of Data Table */
	@When("^I login with the following data$")
	public void i_login_with_the_following_data(DataTable dt) throws Exception {
		 List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		    System.out.println(list.get(0).get("UserName"));
		    System.out.println(list.get(0).get("Password"));
		    objAutomationPractice.loginIntoApplication(list.get(0).get("UserName"), list.get(0).get("Password"));
	}
	
	/** With Header & With Multiple Data of Data Table */
//	@When("^I login with the following data$")
//	public void i_login_with_the_following_data(DataTable dt) throws Exception {
//		List<List<String>> list = dt.asLists(String.class);
//		for(int i=1; i<list.size(); i++) { 
//			System.out.println(list.get(i).get(0)); 
//			System.out.println(list.get(i).get(1));
//		    objAutomationPractice.loginIntoApplication(list.get(i).get(0), list.get(i).get(1));
//		}
//	}
	
	@Then("^Check home page is displayed$")
	public void check_home_page_is_displayed() throws Exception {
		System.out.println("TearDown the Envirnoment ");
		//objAutomationPractice.tearDownEnvirnoment();
	}
	
	@Given("^product Is Displayed$")
	public void product_Is_Displayed() throws Throwable {
		System.out.println("Product Is Displayed ");
	}

	@When("^product Add Into Cart as \"([^\"]*)\"$")
	public void product_Add_Into_Cart_as(String element) throws Throwable {
		System.out.println("Product Add To cart");
		objAutomationPractice.productAddIntoCartInApplication(element);
	}

	@Then("^Check Product Added Into Cart$")
	public void check_Product_Added_Into_Cart() throws Throwable {
		System.out.println("View Product is Added to the Cart");
		objAutomationPractice.viewTheCart();
		objAutomationPractice.tearDownEnvirnoment();
	}
	
}
