package cucumber1.cucumbercase1;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class practiseclass {
	int a,b,s,p;
	@Given("^user must enter input values$")
	public void user_must_enter_input_values() throws Throwable {
	    System.out.println("User enters input");
	    a=10;
	    b=20;
	}

	@Then("^assign the values to variables a & b$")
	public void assign_the_values_to_variables_a_b() throws Throwable {
	    System.out.println(a+" "+b);
	}

	@When("^add two inputs$")
	public void add_two_inputs() throws Throwable {
	    s=a+b;
	}

	@Then("^Display the sum$")
	public void display_the_sum() throws Throwable {
	   System.out.println("sum is"+s);
	}

	@When("^multiply two inputs$")
	public void multiply_two_inputs() throws Throwable {
	    p=a*b;
	}

	@Then("^display the product$")
	public void display_the_product() throws Throwable {
	  System.out.println("product is"+p);
	}



}
