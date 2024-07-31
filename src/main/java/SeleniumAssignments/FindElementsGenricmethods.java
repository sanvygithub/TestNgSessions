package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsGenricmethods {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(3000);
		By Links = By.cssSelector(".fMAcTI a");
		
		int linksSize=getElementsSize(Links);
		System.out.println(linksSize);
		
		List<String> LinksText = getLinksValues(Links);
		System.out.println(LinksText);
		
	}

	public static int getElementsSize(By locator) {
		return getElements(locator).size();

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getLinksValues(By locator) {
		List<WebElement> footerLinks = getElements(locator);
		List<String> LinksList = new ArrayList<String>();
		for (WebElement e : footerLinks) {
			String Text = e.getText();
			LinksList.add(Text);
		}
		return LinksList;

	}

}
