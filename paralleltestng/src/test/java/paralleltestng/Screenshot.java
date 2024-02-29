package paralleltestng;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.base64.Base64;

public class Screenshot {
	
	
	WebDriver driver;
	
	
	@Test()
	public void screenSot() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	/*
	 * String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
	 * driver.findElement(By.xpath("//a[text()='Fresh']")).sendKeys(tab);
	 */
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.hyrtutorials.com/p/broken-links.html");
	String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	String destpath=
	}
	

}










