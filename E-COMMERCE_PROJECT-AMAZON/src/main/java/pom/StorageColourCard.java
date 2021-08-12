package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorageColourCard {
	
private WebDriver driver;
	

	@FindBy (xpath = "(//p[contains(text(),'128GB')])[1]")
	private WebElement storage;
	
	@FindBy (xpath = "(//img[@class='imgSwatch'])[4]")
	private WebElement colour;
	
	@FindBy (xpath = "//input[@title='Add to Shopping Cart']")
	private WebElement AddToCard;


	public StorageColourCard(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


	public void storage() {
		storage.click();
		
	}


	public void colour() {
		colour.click();
		
	}


	public void AddToCard() {
		AddToCard.click();
	
		
	}

}
