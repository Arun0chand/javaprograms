package paralleltestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametersbrowser {
	
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	
	public void testParameter(String browser) {
		System.out.println("Running browser is"+browser);
		
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equals("Internet Explorer"))
				{ 
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("Fire Fox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		driver.get("https://www.amazon.in/");
	}
}

		
	



		
	
