package cucumber1.cucumbercase1;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberclass {
	String str;
	@Given("^type hello$")
	public void type_hello() throws Throwable {
	     str = "Hello world";
	    //throw new PendingException();
	}

	@When("^execute the code$")
	public void execute_the_code() throws Throwable {
	    System.out.println(str);
	    //throw new PendingException();
	}

	@Then("^Hello must be displayed in the console$")
	public void hello_must_be_displayed_in_the_console() throws Throwable {
	    System.out.println("success");
	    //throw new PendingException();
	}



}
