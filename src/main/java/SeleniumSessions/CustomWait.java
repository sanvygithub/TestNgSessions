package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By Locator, int timeUnit) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeUnit) {
			try {
				element = getElement(Locator);
				System.out.println("Element found in : " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + " for " + Locator);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();

				}

			}
			attempts++;
		}
		if (element == null) {
			System.out.println(
					"element is not found....tried for : " + timeUnit + " secs " + 
							" with the interval of 500 millisecs");
			throw new FrameworkException("TimeOutException");
		}
		return element;

	}
	public static WebElement retryingElement(By Locator, int timeUnit,int IntervalTime) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeUnit) {
			try {
				element = getElement(Locator);
				System.out.println("Element found in : " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + " for " + Locator);
				try {
					Thread.sleep(IntervalTime*1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();

				}

			}
			attempts++;
		}
		if (element == null) {
			System.out.println(
					"element is not found....tried for : " + timeUnit + " secs " + 
							" with the interval of "+ IntervalTime  + " secs");
			throw new FrameworkException("TimeOutException");
		}
		return element;

	}


	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By firstName = By.name("first_name11");
		//retryingElement(firstName, 20).sendKeys("Sandhya Kishore");
		retryingElement(firstName, 20,2).sendKeys("Sandhya Kishore");
	}

}
