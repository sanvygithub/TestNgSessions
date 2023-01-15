package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By Linkedin = (By.xpath("//a[contains(@href,'linkedin')]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Linkedin)).click();

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		driver.switchTo().window(childWindowID);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.close();
	}

}
