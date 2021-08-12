package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
private WebDriver driver;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchbar;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void searchbar() {
		searchbar.sendKeys("I phone 12 pro");
		
	}

	public void searchButton() {
		searchbutton.click();
		
	}
}