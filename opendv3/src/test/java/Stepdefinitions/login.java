package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	WebDriver driver;
	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		 driver.get(url);
	   
	}

	@When("user enters the email as {string} and password as {string}")
	public void user_enters_the_email_as_and_password_as(String emailid, String password) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(emailid);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(1000);
	    driver.findElement(By.id("Password")).sendKeys(password);
		   
	    
	}

	@When("click on the login")
	public void click_on_the_login() {
	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("page tilte should be {string}")
	public void page_tilte_should_be(String title) {
	   Assert.assertEquals(title, driver.getTitle());
	}

	@When("user click on the logout link")
	public void user_click_on_the_logout_link() {
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title1) {
		 Assert.assertEquals(title1, driver.getTitle());
	}

	@Then("close the browser")
	public void close_the_browser() {
	 driver.close();
	}

}
