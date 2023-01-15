package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		selectSubMenu("div","Add-ons","SpicePlus");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void selectSubMenu(String html, String parent, String child) {

		By parentMenu = By.xpath("//" + html + "[text()='" + parent + "']");
		By childMenu = By.xpath("//" + html + "[text()='" + child + "']");

		WebElement mainMenu = getElement(parentMenu);

		Actions act = new Actions(driver);

		act.moveToElement(mainMenu).build().perform();

		doClick(childMenu);

	}

}
