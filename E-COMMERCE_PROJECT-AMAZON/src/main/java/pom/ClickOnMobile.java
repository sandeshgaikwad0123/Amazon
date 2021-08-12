package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnMobile {

	private WebDriver driver;

	
	@FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal'][1]")
	private WebElement select;

	public ClickOnMobile(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

		}

	public void select() {
		select.click();
		
	}

}
