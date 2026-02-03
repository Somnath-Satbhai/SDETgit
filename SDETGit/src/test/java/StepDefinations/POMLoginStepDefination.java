/*package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginStepDefination {
	static WebDriver driver;

	LoginPage login;

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
		// driver.findElement(By.id("user-name")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);
		// Thread.sleep(20000);

		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("Click on login button")
	public void click_on_login_button() {
		// driver.findElement(By.id("login-button")).click();

		login.clickLogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()
		// > 0,
		// "User is navigated to home page");

		login.isLogoDisplayed();
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
*/
