package Workshop.BDD;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@SuppressWarnings("unused")
public class Steps {
	
	ChromeDriver driver = new ChromeDriver();
	WebElement username,password,signin, profile;
	
	public void initialize(){
		username = driver.findElement(By.cssSelector("#login_field"));
	    password = driver.findElement(By.cssSelector("#password"));
	    signin = driver.findElement(By.cssSelector(".btn-primary"));
	}
	
	@Given("^The application is launched and available$")
	public void the_application_is_launched_and_available() throws Throwable {
	    driver.get("https://github.com/login");
	    Thread.sleep(2000);
	    initialize();
	}

	@When("^User login to the app with Demo and kumar\\.vastav$")
	public void user_login_to_the_app_with_Demo_and_kumar_vastav() throws Throwable {
	    username.sendKeys("Demo");
	    password.sendKeys("kumar.vastav");
	    signin.click();
	    Thread.sleep(1000);
	}

	@SuppressWarnings("deprecation")
	@Then("^Verify the user login with failed$")
	public void verify_the_user_login_failed() throws Throwable {
	    Assert.assertNotNull(driver.findElement(By.cssSelector(".flash-error")));
	    driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the user login with success$")
	public void verify_the_user_login_with_success() throws Throwable {
		Assert.assertNotNull(driver.findElement(By.cssSelector(".name")));
	    driver.quit();
	}

	@When("^User login to the app with kumar\\.vastav and testing$")
	public void user_login_to_the_app_with_kumar_vastav_and_testing() throws Throwable {
		username.sendKeys("kumar.vastav");
	    password.sendKeys("testing");
	    signin.click();
	    Thread.sleep(1000);
	}
	
	@When("^User login to the app with username and password$")
	public void user_login_to_the_app_with_username_and_password() throws Throwable {
		username.sendKeys("kumarvastav");
	    password.sendKeys("testing123");
	    signin.click();
	    Thread.sleep(1000);
	}
	
	@When("^User login to the app with kumarvastav and Turtle\\.(\\d+)$")
	public void user_login_to_the_app_with_kumarvastav_and_Turtle(int arg1) throws Throwable {
		username.sendKeys("kumarvastav");
	    password.sendKeys("Turtle.12");
	    signin.click();
	    Thread.sleep(1000);
	}

}
