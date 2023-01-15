package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.linkText("Meadow Lake, Canada"));

		// Right ele
		String RightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(RightIndex);

		String Rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(Rank);

		// below ele
		String BelowCountry = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(BelowCountry);

		// above ele
		String AboveCountry = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(AboveCountry);
		
		//near ele
		String nearCountry = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCountry);
		
	}

}
