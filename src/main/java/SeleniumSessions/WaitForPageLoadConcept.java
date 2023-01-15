package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForPageLoadConcept {

	static WebDriver driver;

	public static void waitForPageLoad(int TimeOut) {

		long endTime = System.currentTimeMillis() + TimeOut;
		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String PageState = js.executeScript(" return document.readyState").toString();
			if(PageState.equals("complete")) {
				System.out.println("Page is fully loaded");
				break;
			}
		}

	}

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/pricing.html");
		waitForPageLoad(10);

	}

}
