package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlert {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		 waitForAlertAndSendKeys(5, "Welcome Sandhya K");
		 waitForAlertAndAccept(5);
		 
		 
		
		
//		Alert alert = waitAlertIsPresentAndSwitch(10);
//		System.out.println(alert.getText());
//		alert.accept();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();

		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// driver.get("https://www.amazon.com/");

		// driver.findElement(By.linkText("Register")).click();

		// driver.findElement(By.linkText("Careers")).click();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.titleContains("Register"));
		// System.out.println(driver.getTitle());

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlContains("jobs"));
//		System.out.println(driver.getCurrentUrl());

		// 1.Title

//		String Title = waitForTitleContains("Register", 10);
//		System.out.println(Title);
//
//		String TitleIs = waitForTitleContains("Register Account", 10);
//		System.out.println(TitleIs);
//		String Url=waitForUrlToBe("https://www.amazon.jobs/en/", 5);
//		System.out.println(Url);

	}

	public static Alert waitAlertIsPresentAndSwitch(int TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void waitForAlertAndGetText(int TimeUnit) {
		waitAlertIsPresentAndSwitch(TimeUnit).getText();
	}

	public static void waitForAlertAndAccept(int TimeUnit) {
		waitAlertIsPresentAndSwitch(TimeUnit).accept();
	}

	public static void waitForAlertAndDismiss(int TimeUnit) {
		waitAlertIsPresentAndSwitch(TimeUnit).dismiss();
	}

	public static void waitForAlertAndSendKeys(int TimeUnit, String Value) {
		waitAlertIsPresentAndSwitch(TimeUnit).sendKeys(Value);
	}

	public static String waitForUrlContains(String FractionValue, int Timeunit) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeunit));
		if (wait.until(ExpectedConditions.urlContains(FractionValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected Url is not present");
			return null;
		}

	}

	public static String waitForUrlToBe(String UrlValue, int Timeunit) { // Exact url value need to be given

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeunit));
		if (wait.until(ExpectedConditions.urlToBe(UrlValue))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println("Expected Url is not present");
			return null;
		}

	}

	public static String waitForTitleContains(String FractionValue, int Timeunit) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeunit));
		if (wait.until(ExpectedConditions.titleContains(FractionValue))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected Title is not present");
			return null;
		}

	}

	public static String waitForTitleIs(String titleVal, int Timeunit) { // Exact title we need to provide

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeunit));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			return driver.getTitle();
		} else {
			System.out.println("Expected Title is not present");
			return null;
		}

	}

}
