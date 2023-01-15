package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// selenium 3.0
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		// 1.it is accessible to web elements only
		// 2.it is not accessible to non webElements --Alerts,Title,Url's
		// 3.it is global wait
		// 4.it is applied to all the web elements once it is declared.

		// Selenium 4.0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// applies to all web elements

		driver.get("https://naveenautomationlabs.com/opencart/");

		WebElement iphone = driver.findElement(By.linkText("iPhone"));
		String Href = iphone.getAttribute("href");
		System.out.println(Href);

	}

}
