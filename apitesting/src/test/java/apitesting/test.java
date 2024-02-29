package apitesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;
	
	@Test
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
}