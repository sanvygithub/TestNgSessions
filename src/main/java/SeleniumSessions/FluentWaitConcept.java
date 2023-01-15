package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

// WebDriverWait C-----FluentWait C ---------Wait I-----Until()

		By Forgotpassword = By.linkText("Forgot Password?");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(ElementNotInteractableException.class)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.withMessage("Element not found");

		wait.until(ExpectedConditions.visibilityOfElementLocated(Forgotpassword)).click();
	}

	public static void waitForElementToBeVisibleWithFluentWait(By Locator, int TimeUnit, int IntervalTimeUnit) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(TimeUnit))
				.pollingEvery(Duration.ofSeconds(IntervalTimeUnit)).ignoring(ElementNotInteractableException.class)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.withMessage("Element not found");

		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator)).click();

	}

	public static void waitForElementToBeVisibleWithWebDriverWait(By Locator, int TimeUnit, int IntervalTimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit),Duration.ofSeconds(IntervalTimeUnit));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotInteractableException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.withMessage("Element NOt found.....");

		wait.until(ExpectedConditions.elementToBeClickable(Locator)).click();
	}

}
