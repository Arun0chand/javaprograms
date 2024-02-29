package takescreen;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	@Test(testName="testGoogle")
	public void testGoogle() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("hyr tutorials",Keys.ENTER);
		String expectedTitle="hyr tutorials - Google Search";
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Title is mismatch");
	}
	
	@Test(testName="opend")
	public void testopend() {
		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("admin@opend.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Coding Ground"))
	}
	@Test( e )
	public void test() {
		
	}

}
