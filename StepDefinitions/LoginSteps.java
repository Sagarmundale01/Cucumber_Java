package StepDefinitions;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Inside Step - user is on login page");	
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");
	
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		System.out.println("Inside Step - clicks on login button");
	}
	
	
	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	
		System.out.println("Inside Step - user is navigate to home page");
	}
	
	



}
