package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		WebElement S = driver.findElement(By.id("Form_getForm_Country"));

		Select e = new Select(S);
		// e.selectByIndex(2);
		// e.selectByVisibleText("Chile");
		// e.selectByValue("Christmas Island");

		By country = By.id("Form_getForm_Country");
		doSelectByIndex(country, 7);
		doSelectByVisibleText(country, "India");
		Thread.sleep(2000);
		doSelectByValue(country,"Christmas Island" );
		

	}

	public static void doSelectByIndex(By locator, int value) {
		Select e = new Select(getElement(locator));
		e.selectByIndex(value);
	}
	public static void doSelectByVisibleText(By locator, String value) {
		Select e = new Select(getElement(locator));
		e.selectByVisibleText(value);
	}
	public static void doSelectByValue(By locator, String  Text) {
		Select e = new Select(getElement(locator));
		e.selectByValue(Text);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
