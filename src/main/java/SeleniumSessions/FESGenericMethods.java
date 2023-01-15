package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenericMethods {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		// List<WebElement> footerList =
		// driver.findElements(By.xpath("//div[contains(@class,'footer-left-section')]//a"));
		// List<WebElement> footerList1 =
		// driver.findElements(By.xpath("//div[contains(@class,'footer-copyrights')]//a"));

		By footerLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		// By footerLinks1=By.xpath("//div[contains(@class,'footer-copyrights')]//a");

		List<String> footerText = getElementsTextList(footerLinks);
		System.out.println(footerText);
		
		int actualFooterCount=totalElementsCount(footerLinks);
		System.out.println(actualFooterCount);
		if(actualFooterCount==21) {
			System.out.println("footer--count-----Pass");
		}

		if (footerText.contains("Investors")) {
			System.out.println("PASS");
		}
	}

	public static int totalElementsCount(By Locator) {
		return getElements(Locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> footerList = getElements(locator);
		List<String> eleText = new ArrayList<String>();

		for (WebElement e : footerList) {
			String Text = e.getText();
			// System.out.println(Text);
			eleText.add(Text);

		}
		return eleText;

	}

}
