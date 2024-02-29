package apitest;


	

public class TooltipMessage {	
	
    public static void main(String[] args) {									
     
       				
       WebDriverManager.chromedriver().setup();					
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/social-icon.html");
        WebElement l = driver.findElement(By.linkText("https://www.guru99.com/software-testing.html"));
        String stylevalue = l.getAttribute("style");
        System.out.println("The href value is: " + stylevalue);
       
    }
}