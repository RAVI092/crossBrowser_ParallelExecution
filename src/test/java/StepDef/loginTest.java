package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseCls;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest extends BaseCls {

	
	@Test
	@Given("User is at login page")
	public void user_is_at_login_page() {
	   
	    loadUrl("https://www.flipkart.com");
System.out.println("ravi");

	}

	@When("he enters the valid user name <\"u_name\"> and password <\"pass\">")
	public void he_enters_the_valid_user_name_u_name_and_password_pass() {
	  System.out.println(d1.getTitle());
	    
	}

	@When("click the sign-in button")
	public void click_the_sign_in_button() {
	   
	    
	}

	@Then("Verify that he is logged in")
	public void verify_that_he_is_logged_in() {
	   
	    
	}

	@When("he enters the in-valid user name <\"u-name\"> and password <\"pass\">")
	public void he_enters_the_in_valid_user_name_u_name_and_password_pass() {
		System.out.println(d1.getTitle());
	    
	}	

	
	
}
