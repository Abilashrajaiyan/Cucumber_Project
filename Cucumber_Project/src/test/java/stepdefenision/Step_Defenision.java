package stepdefenision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defenision {
	WebDriver  driver;
	@Given("User Enter The Valid URL")
	public void user_Enter_The_Valid_URL() 
	{
	driver = new ChromeDriver();  
	driver.get("http://adactinhotelapp.com/");
	}

	@When("User enter the Username in the {string} field")
	public void user_enter_the_Username_in_the_field(String string) {
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("Abilash04");
	   
	}

	@When("User Enter the Password in the {string} field")
	public void user_Enter_the_Password_in_the_field(String string) {
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Samsungabilash4");
	   
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement Click=driver.findElement(By.id("login"));
		Click.click();
	   
	}

	@Then("login should be sucess and navigate to next page")
	public void login_should_be_sucess_and_navigate_to_next_page() {
	    
	}



}
