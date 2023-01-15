package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeClicked {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		By Forgotpassword = By.linkText("Forgot Password?");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(1000));
		wait.until(ExpectedConditions.elementToBeClickable(Forgotpassword)).click();

	}

//	public static void waitForClickableElementAndClick(By locator, int TimeUnit) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
//		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
//
//	}

}
