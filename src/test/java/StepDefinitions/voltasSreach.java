package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class voltasSreach {
	WebDriver driver;
	@Given("^I am on the Voltas application homepage$")
	public void I_am_on_the_Voltas_application_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://182.74.225.102:5589/iams");
	    driver.findElement(By.id("UserID")).sendKeys("Support.Voltas");
		//System.out.println("username "+ username +" is the");
		driver.findElement(By.id("Password")).sendKeys("AGS_1000@Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}
	@When("^I enter \"([^\"]*)\" in the search bar and press Enter$")
	public void i_enter_in_the_search_bar_and_press_enter(String EnterValues) throws InterruptedException {
		System.out.println(EnterValues);
		
		driver.findElement(By.xpath("//*[@id=\"astPrfl_filter\"]/label/input")).sendKeys(EnterValues);
		Thread.sleep(3000);
		
	  
	}
	
	@Then("I should see search results related to {string}")
	public void i_should_see_search_results_related_to(String values) {
		
        driver.quit();
	}




}
