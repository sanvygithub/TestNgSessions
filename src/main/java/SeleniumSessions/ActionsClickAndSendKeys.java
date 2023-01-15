package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By EmailId = By.id("input-email");
		By Password = By.id("input-password");
		By LoginBtn = By.xpath("//input[@value='Login']");

//		WebElement email=driver.findElement(EmailId);
//		WebElement password=driver.findElement(Password);
//		WebElement Login=driver.findElement(LoginBtn);
//				
//		Actions Act=new Actions(driver);
//		Act.sendKeys(email, "Sandhya123@gmail.com").build().perform();
//		Act.sendKeys(password,"sandhya123").build().perform();
//		Act.click(Login).build().perform();
		
		
		doActionSendKeys(EmailId, "Kishore143@gmail.com");
		doActionSendKeys(Password,"Kishore143");
		doActionsClick(LoginBtn);

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doActionSendKeys(By Locator, String Value) {

		Actions Act = new Actions(driver);
		Act.sendKeys(getElement(Locator), Value).build().perform();
	}

	public static void doActionsClick(By Locator) {
		Actions Act = new Actions(driver);
		Act.click(getElement(Locator)).build().perform();

	}

}
