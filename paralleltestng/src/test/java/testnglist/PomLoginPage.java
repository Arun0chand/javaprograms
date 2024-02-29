package testnglist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
	
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='email_id']")
	
	private WebElement userNameInput;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement clickButton;
	
	public PomLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void userName(String username) {
		userNameInput.clear();
		userNameInput.sendKeys(username);
	}
	public void passWord(String password) {
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	public void loginClick() {
		clickButton.click();
	}
}


















