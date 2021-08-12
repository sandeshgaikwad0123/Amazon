package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openChromeBrowser()
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	return driver;
}
	
	public static WebDriver openFireFoxBrowser()
	{

	System.setProperty("webdriver.gecko.driver", "D:\\Firefox Setup 90.0.2.exe\\");

	WebDriver driver = new FirefoxDriver();
	
	return driver;
	
	}
}
