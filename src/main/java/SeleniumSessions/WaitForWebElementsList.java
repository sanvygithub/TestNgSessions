package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElementsList {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
		By footer = By.cssSelector("ul.footer-nav a");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> footerLink = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
//		System.out.println(footerLink.size());

//		List<WebElement> footerLink = waitForPresenceOfAllWebElements(footer, 10);
//		System.out.println(footerLink.size());

		List<WebElement> footerLink = waitForVisibilityeOfAllWebElements(footer, 10);
		System.out.println(footerLink.size());
	}

	public static List<WebElement> waitForPresenceOfAllWebElements(By locator, int TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	public static List<WebElement> waitForVisibilityeOfAllWebElements(By locator, int TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
}
