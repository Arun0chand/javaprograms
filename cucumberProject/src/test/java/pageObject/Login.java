package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement txtMail;
	
	@FindBy(id="Password")
	private WebElement textPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	
	public void setUsername(String name) {
		
		txtMail.clear();
		txtMail.sendKeys(name);
	}
	
	public void setPassword(String password) {
		textPassword.clear();
		textPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clickLogout( ) {
		logOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
