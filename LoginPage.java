package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver ldriver;
	
	LoginPage(WebDriver foxdriver)
	{
		ldriver = foxdriver;
		PageFactory.initElements(foxdriver,this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	
	//public static void main(String[] args, String randomNumber) throws InterruptedException {
		// String browser = "Firefox";
		 WebDriver driver;
	
	
	if (browser.contentEquals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BlackHole\\eclipse-workspace\\techfios-test\\lib\\Drivers\\chromedriver.exe");
				ldriver = new ChromeDriver();
	}
	
	 else if  (browser.equalsIgnoreCase("Firefox"))

	{
System.setProperty("webdriver.gecko.driver", "C:\\Users\\BlackHole\\eclipse-workspace\\techfios-test\\lib\\Drivers\\geckodriver.exe");
	 foxdriver = new FirefoxDriver();
	}
	
	
	}
}
