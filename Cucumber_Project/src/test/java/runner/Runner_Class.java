package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Abilash\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\Features\\Adactin.feature",
glue = "step_Defenision")

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abilash\\eclipse-workspace\\Cucumber_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
		public static void tearDown() 
		{
			driver.close();
		}
	}


