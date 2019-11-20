package cucumber1.cucumbercase1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class practise2class {
	@Given("^user must be in login page$")
	public void user_must_be_in_login_page() throws Throwable {
	 System.out.println("user is in login page");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    System.out.println("login using "+arg1+" and "+arg2);
	}

	@When("^performs login$")
	public void performs_login() throws Throwable {
		System.out.println("click on login");
	  
	   
	}

	@Then("^user directed to homepage$")
	public void user_directed_to_homepage() throws Throwable {
		System.out.println("wlecome to homepage");
	}



}
