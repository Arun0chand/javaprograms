package arun;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Login;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginSteps {
	
	public WebDriver driver;
	public Login log;
	
	@Given("User lauch the chrome browser")
	public void user_lauch_the_chrome_browser() {
	    log=new Login(driver);
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@When("User opens the url {string}")
	public void user_opens_the_url(String url) {
	  driver.get(url);  
	}

	@When("^User enters the mails as (.*) and password as (.*)$")
	public void user_enters_the_mails_as_and_password_as(String email, String password) {
	   
		log=new Login(driver);
		log.setUsername(email);
	    log.setPassword(password);
	}

	@When("Click on the login")
	public void click_on_the_login( ) {
	   log.clickLogin();
	}
	

	@Then("Page title should be navigated to {string}")
	public void page_title_should_be_navigated_to(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful")) {
		   driver.close();
		   Assert.assertTrue(false);
		   }
		   else {
			Assert.assertEquals(title, driver.getTitle());   
		   }
	   }
	

	@When("user click on the logout link")
	public void user_click_on_the_logout_link() {
	   log.clickLogout();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}

	
	
}
