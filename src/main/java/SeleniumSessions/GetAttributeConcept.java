package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		String hrefVal=driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		System.out.println(hrefVal);
//		
//		String label=driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
//		System.out.println(label);
		
		
		By hrefVal=By.id("nav-logo-sprites");
		By label= By.id("nav-logo-sprites");
		
		String href=doGetAttribute(hrefVal, "href");
		String aria_label=doGetAttribute(label,"aria-label");
		
		System.out.println(href);
		System.out.println(aria_label);
		
	}
	
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}
	
	public static String  doGetAttribute(By locator,String AttributeName) {
		return getElement(locator).getAttribute(AttributeName);
	}

}
