package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.id("pact")));
		
		
//		"document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')"
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement tea= (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
		tea.sendKeys("Green Tea");

	}

}
