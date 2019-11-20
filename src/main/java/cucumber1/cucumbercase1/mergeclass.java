package cucumber1.cucumbercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class mergeclass {
	WebDriver driver;
	@Given("^user has launched testme app in browser$")
	public void user_has_launched_testme_app_in_browser() throws Throwable {
		driver=utility.testRegistration("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		System.out.println("browser launched");
	   
	}

	@When("^user entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entered_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		
	
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
		System.out.println("vaid credentials");
		
	}

	@Then("^user is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	 Assert.assertEquals("Home",driver.getTitle());
	 System.out.println("login successful");
	}



}
