package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
private WebDriver driver;
	
//	@FindBy (xpath = "(//span[contains(text(),'Hello, Sign in')])")
//	private WebElement user;
	
	@FindBy (xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement user;
	
	@FindBy (xpath = "//input[@id='ap_email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath = "//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement signIn;
	

	
	public LoginPage (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void user() {
		user.click();
		
	}
	public void sendUser() {
		username.sendKeys("9552342143");
		
	}
	
	public void clickOncontinue() {
		Continue.click();
		
	}

	public void sendPassword() {
		password.sendKeys("Sandy9867");
		
	}

	public void clickOnLogin() {
		signIn.click();
		
	}




}

