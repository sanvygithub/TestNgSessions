package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");

			}

			WebElement next = driver.findElement(By.linkText("Next"));
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...");
				break;
			}
			next.click(); 
			Thread.sleep(1000);

		}
	}

// single selection
//		while (true) {
//			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
//				selectMultipleCountry("India");
//
//			}
//			else {
//				WebElement next=driver.findElement(By.linkText("Next"));
//				if(next.getAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over...country not found..");
//					break;
//				}
//				next.click();
//			}
//
//		}

	public static void clickCheckBox(String country) {
		driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

	public static void selectMultipleCountry(String country) {
		List<WebElement> countries = driver
				.findElements(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : countries) {
			e.click();
		}
	}

}
