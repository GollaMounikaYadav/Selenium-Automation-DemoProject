package StepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class voltasApplication {
	
	WebDriver driver;
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() {
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

	@When("^I view the dropdown menu$")
	public void i_view_the_dropdown_menu() throws InterruptedException {
		driver.findElement(By.className("form-control")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"astPrfl_length\"]/label/select/option[2]")).click();
	   
	}

	@Then("^the dropdown should contain the following options:$")
	public void the_dropdown_should_contain_the_following_options(List<String> options) {
		 WebElement dropdown = driver.findElement(By.className("form-control"));
	        List<WebElement> dropdownOptions = dropdown.findElements(By.tagName("option"));
	        List<String> actualOptions = new ArrayList<>();

	        for (WebElement option : dropdownOptions) {
	            actualOptions.add(option.getText());
	        }

	        Assert.assertEquals(options, actualOptions);
	        driver.quit();
	}

	
	@When("^I select \"([^\"]*)\" from the dropdown menu$")
	public void i_select_from_the_dropdown_menu(String option) throws InterruptedException {
	
		
		WebElement dropdown = driver.findElement(By.className("form-control"));
		
        Select select = new Select(dropdown);
        
        
        select.selectByVisibleText(option);
        
        Thread.sleep(3000);
        driver.quit();
	  
	}
//	@Then("^the page should display content related to \"([^\"]*)\"$")
//	public void the_page_should_display_content_related_to(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}



	

}
