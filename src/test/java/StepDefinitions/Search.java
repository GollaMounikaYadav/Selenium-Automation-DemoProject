package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Given("^I visit the website as a guest user$")
	public void  I_visit_the_website_as_a_guest_user() { 
		
		
		System.out.println("<<< I visit the website as a guest user");
		
	}
	
	@When("^I select the books option from the search dropdown$")
	public void i_select_the_books_option_from_the_search_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("^I click on search icon option$")
	public void i_click_on_search_icon_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^I should see the page having heading as Amazon Best Reads is getting displayed$")
	public void i_should_see_the_page_having_heading_as_amazon_best_reads_is_getting_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^I should not see the other category products$")
	public void i_should_not_see_the_other_category_products() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	

}
