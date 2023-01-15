package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));

		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();

	}
	
	
	public static void waitForFrameAndSwitch(int ID,int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ID));
		
	}
	
	public static void waitForFrameAndSwitch(By locator,int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	public static void waitForFrameAndSwitch(String nameOrId,int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
		
	}
	
	public static void waitForFrameAndSwitch(WebElement frameElement,int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
		
	}
	

}
