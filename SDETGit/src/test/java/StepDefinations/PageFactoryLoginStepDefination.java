package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginStepDefination {
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	}

	// @When("User enters valid username and password")

	@When("User enters valid {string} and {string}")
	// public void user_enters_valid_username_and_password() {
	public void user_enters_valid_and(String username, String password) throws Exception {
		login = new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("Click on login button")
	public void click_on_login_button() {
		login.clickOnLogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {

		home = new HomePageFactory(driver);
		home.isCardDisplayed();

		// Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()
		// > 0,
		// "User is navigated to home page");
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
