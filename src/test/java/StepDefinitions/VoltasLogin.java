package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VoltasLogin {
	
	WebDriver driver;
	
	@Given("^I navigate to application URL$")
	public void i_navigate_to_application_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://182.74.225.102:5589/iams");
	}

	@When("^I enter Username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void i_enter_username_as_and_password_as_into_the_fields(String username, String password) {
			
		driver.findElement(By.id("UserID")).sendKeys(username);
		//System.out.println("username "+ username +" is the");
		driver.findElement(By.id("Password")).sendKeys(password);
		
	}

	@And("^I click on SignIn Button$")
	public void i_click_on_sign_in_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.className("fa fa-angle-down")).click();
		//driver.findElement(null)
	   
	}

	@Then("^User Should be able to login based on \"([^\"]*)\" login status$")
	public void user_should_be_able_to_login_based_on_login_status(String expectedResult) {
		String actualResult = null;
		
		try {
		
			Alert alert = driver.switchTo().alert();
		
			if(alert.getText().contains("Error password or username")) {
				actualResult = "failure";
			}
		
		}catch(Exception e) {
			
			actualResult = "success";
		
		}
			
		Assert.assertEquals(expectedResult,actualResult);
		
		
		driver.quit();
	    
	    
	}



}
