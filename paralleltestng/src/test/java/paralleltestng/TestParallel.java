package paralleltestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestParallel {
	
	WebDriver driver=null;
	@Test()
	
	public  void testParallel1() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    //driver.close();
		
	}
	@Test()
	
	public void testParallel2() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.redbus.in/");
//	    driver.close();
		
	}
}
