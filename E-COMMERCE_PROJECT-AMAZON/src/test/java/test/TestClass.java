package test;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import pom.ClickOnMobile;
import pom.HomePage;
import pom.LoginPage;
import pom.ProceedToCheckOut;
import pom.StorageColourCard;

public class TestClass extends Base{

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.user();
		loginpage.sendUser();
		loginpage.clickOncontinue();
		loginpage.sendPassword();
		loginpage.clickOnLogin();
		Thread.sleep(3000);

		HomePage homePage = new HomePage(driver);
		homePage.searchbar();
		homePage.searchButton();
		Thread.sleep(3000);

		ClickOnMobile clickonmobile = new ClickOnMobile(driver);
		clickonmobile.select();
		Thread.sleep(3000);

		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		Thread.sleep(3000);

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);

		StorageColourCard storagecolourcard = new StorageColourCard(driver);
		storagecolourcard.storage();
		Thread.sleep(3000);

		storagecolourcard.colour();
		Thread.sleep(3000);

		storagecolourcard.AddToCard();
		Thread.sleep(3000);
		
		ProceedToCheckOut proceed = new ProceedToCheckOut(driver);
		proceed.cancel();
		Thread.sleep(3000);

		proceed.card();
		Thread.sleep(3000);

		
		System.out.println("I Phone 12 Pro Max Added To Card Successfully");
		
		
		
	}

}


