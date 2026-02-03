package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;

	@FindBy(css = "a[data-test='shopping-cart-link']")
	WebElement lbl_cart;

	public void isCardDisplayed() {

		lbl_cart.isDisplayed();

	}

	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
