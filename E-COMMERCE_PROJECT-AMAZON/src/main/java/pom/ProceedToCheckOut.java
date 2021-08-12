package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[@id='attach-close_sideSheet-link']")
	private WebElement cancel;
	
	@FindBy (xpath = "//span[@id='nav-cart-count']")
	private WebElement card;

	public ProceedToCheckOut(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void card() {
		card.click();
		
	}

	public void cancel() {
		cancel.click();
	}

}
