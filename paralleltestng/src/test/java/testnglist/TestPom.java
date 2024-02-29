package testnglist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPom {
	WebDriver driver;
	
	@Test
	public void testng() {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
		
		PomLoginPage pp=new PomLoginPage(driver);
		
		
		pp.userName("admin@opend.com");
		pp.passWord("1234");
		pp.loginClick();
		
//		driver.quit();
		
	}
	

}
