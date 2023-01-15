package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentChildMenu {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);

		By mainMenu = By.xpath("//a[@qa='categoryDD']");

		selectMultilevel(mainMenu, "a", "Beverages", "Tea", "Tea Bags");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectMultilevel(By locator, String html, String level1, String level2, String level3)
			throws InterruptedException {

		By childLevel1 = By.xpath("(//" + html + "[text()='" + level1 + "'])[2]");
		By childLevel2 = By.xpath("(//" + html + "[text()='" + level2 + "'])[2]");
		By childLevel3 = By.xpath("(//" + html + "[text()='" + level3 + "'])[2]");

		WebElement mainMenu = getElement(locator);

		Actions act = new Actions(driver);
		act.moveToElement(mainMenu).build().perform();
		Thread.sleep(2000);

		WebElement Level1 = getElement(childLevel1);
		act.moveToElement(Level1).build().perform();

		WebElement Level2 = getElement(childLevel2);
		act.moveToElement(Level2).build().perform();

		getElement(childLevel3).click();

	}

}
