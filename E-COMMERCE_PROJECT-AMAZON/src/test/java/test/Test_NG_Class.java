package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.ClickOnMobile;
import pom.HomePage;
import pom.LoginPage;
import pom.ProceedToCheckOut;
import pom.StorageColourCard;

public class Test_NG_Class extends Base {
	
	private WebDriver driver;
	private LoginPage loginpage;
	private HomePage homePage;
	private ClickOnMobile clickonmobile;
	private StorageColourCard storagecolourcard;
	private ProceedToCheckOut proceed;
	private String browser;
	
	@BeforeTest
	@Parameters("browser")
    public void launchbrowser(String browser)
    {
		System.out.println("browser");
		driver=openChromeBrowser();

		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver = openChromeBrowser();
		}
		else
		{
			if (browser.equalsIgnoreCase("fireFox"))
			{
				driver = openFireFoxBrowser();
			}
		}
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		LoginPage loginpage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		ClickOnMobile clickonmobile = new ClickOnMobile(driver);
		StorageColourCard storagecolourcard = new StorageColourCard(driver);
		ProceedToCheckOut proceed = new ProceedToCheckOut(driver);

	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);

		LoginPage loginpage = new LoginPage(driver);

		loginpage.user();

		loginpage.sendUser();

		loginpage.clickOncontinue();

		loginpage.sendPassword();

		loginpage.clickOnLogin();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/"))
			
		{
			System.out.println("Test Is Fail");
		}
		else
		{
			System.out.println("Test Is Pass");
		}
		
		
	}
	
	@Test
	public void testclass() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		
		ClickOnMobile clickonmobile = new ClickOnMobile(driver);
		
		StorageColourCard storagecolourcard = new StorageColourCard(driver);

		homePage.searchbar();
		Thread.sleep(3000);

		homePage.searchButton();
		Thread.sleep(3000);
	
		clickonmobile.select();
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);


		storagecolourcard.storage();
		Thread.sleep(3000);

		storagecolourcard.colour();
		Thread.sleep(3000);

		storagecolourcard.AddToCard();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/"))
			
		{
			System.out.println("Test Is Fail");
		}
		else
		{
			System.out.println("Test Is Pass");
		}

	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		ProceedToCheckOut proceed = new ProceedToCheckOut(driver);

		proceed.cancel();
		Thread.sleep(3000);

		proceed.card();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/"))
			
		{
			System.out.println("Test Is Fail");
		}
		else
		{
			System.out.println("Test Is Pass");
		}
		
	}

	@AfterClass
	public void afterclass() throws InterruptedException
	{
		driver.close();
		Thread.sleep(3000);
		
		driver.quit();
		Thread.sleep(3000);
}
}

