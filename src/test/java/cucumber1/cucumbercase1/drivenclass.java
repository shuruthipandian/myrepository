package cucumber1.cucumbercase1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class drivenclass {
	@Given("^user is testing for login functionality$")
	public void user_is_testing_for_login_functionality() throws Throwable {
	   System.out.println("testing login"); 
	}

	@Then("^user logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
	   System.out.println("login successfully");
	}

	@Given("^user is testing the search functionality$")
	public void user_is_testing_the_search_functionality() throws Throwable {
	    System.out.println("testing search");
	}

	@Then("^search works successfully$")
	public void search_works_successfully() throws Throwable {
	    System.out.println("searching successfull");
	}

	@Then("^\"([^\"]*)\" is tester on testme app$")
	public void is_tester_on_testme_app(String arg1) throws Throwable {
	   System.out.println("homepage displayed");
	}



}
