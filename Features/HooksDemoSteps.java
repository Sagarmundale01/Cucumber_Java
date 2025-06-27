package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksDemoSteps {

	WebDriver driver= null;

	@Before(value="@smoke", order=1)
	public void browserSetup() 
	{
		System.out.println("  I am inside browserSetup");
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@Before(value="@regression",order=0)
	public void setup2()
	{
		System.out.println("   I am inside setup2  \n");
	}

	@After(value= "@smoke",order=1)
	public void teardown() 
	{
		System.out.println("   I am inside teardown");
		driver.close();
		driver.quit();
	}

	@After(value="@regression",order=2)
	public void  teardown2()
	{
		System.out.println("   I am inside teardown2  \n");
	}
	
	@BeforeStep
	public static void beforeSteps()
	{
		System.out.println("   I am inside beforeSteps---------");

	}

	@AfterStep
	public static void afterSteps()
	{
		System.out.println("   I am inside afterSteps=======");

	}


	@Given("user is on a login page")
	public void user_is_on_a_login_page() 
	{

	
	}
	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() 
	{

	
	}
	@And("clicks on a login button")
	public void clicks_on_a_login_button() 
	{

	
	}
	@Then("user is navigated to the home page.")
	public void user_is_navigated_to_the_home_page() 
	{

		
		
    }



}
