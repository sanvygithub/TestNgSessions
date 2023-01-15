package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	static WebDriver driver;

	public static void main(String[] args) {

		// Explicit wait
		// WebDriverWait(C)----extends------FluentWait(C)------wait(I)-------until(Where
		// until is a method)
		// until(){
		// all other methods
		// it is not global
		// can be applied specifically for the element
		// can be applied for non webElements-Alerts,Title,Urls

		// By iphone = By.linkText("iPhone");
		By Email = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");

		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// WebElement ele =
		// wait.until(ExpectedConditions.presenceOfElementLocated(iphone));
		// ele.click();

		waitForElementPresence(Email, 10).sendKeys("Naveen@gmail.com");
		getElement(password).sendKeys("test@123");
		getElement(login).click();
	}

	// An expectation for checking that an element is present on the DOM of a page.
	// This does not necessarily mean that the element is visible.
	public static WebElement waitForElementPresence(By locator, int TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	// An expectation for checking that an element is present on the DOM of a page
	// and visible.
	// Visibility means that the element is not only displayed but also has a height
	// and width that is greater than 0.
	public static WebElement waitForElementVisible(By locator, int TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

}
