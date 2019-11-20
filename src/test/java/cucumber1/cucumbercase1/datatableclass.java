package cucumber1.cucumbercase1;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datatableclass {
	@Given("^open the application and go to search page$")
	public void open_the_application_and_go_to_search_page() throws Throwable {
	    System.out.println("search page displayed!!");
	}

	@When("^type the below product and search$")
	public void type_the_below_product_and_search(DataTable arg1) throws Throwable {
		List<Map<String, String>> List=arg1.asMaps(String.class, String.class);
		for(int i=0;i<=List.size();i++)
	    {
	    	System.out.println("search for"+List.get(i).get("products"));
	    }
	}

	@Then("^ensure the product details being displayed$")
	public void ensure_the_product_details_being_displayed() throws Throwable {
	   System.out.println("product details displayed");
	}



}
