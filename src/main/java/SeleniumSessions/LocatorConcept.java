package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);

		// 1.ID attribute: Unique attribute

		// 2.Name attribute:
		// driver.findElement(By.name("email")).sendKeys("test123@gmail.com");

//		By email=By.name("email");
//		eleUtil.doSendKeys(email, "test123@gmail.com");

		// 3. Class Name
		// driver.findElement(By.className("form-control")).sendKeys("test123@gmail.com");

		// 4.Xpath:it is not an attribute,it is the address of WebElement of HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test123@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		By email= By.xpath("//*[@id=\"input-email\"]");
//		By pwd=By.xpath("//*[@id=\"input-password\"]");
//		By Login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		eleUtil.doSendKeys(email,"test123@gmail.com");
//		eleUtil.doSendKeys(pwd, "test123");
//		eleUtil.doClick(Login);

// 		5.CSS Selector
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test123@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

//		By email = By.cssSelector("#input-email");
//		By pwd = By.cssSelector("#input-password");
//		By Login = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//
//		eleUtil.doSendKeys(email, "test123@gmail.com");
//		eleUtil.doSendKeys(pwd, "test123");
//		eleUtil.doClick(Login);

//		6.linkText: only for links: can be duplicate
//		driver.findElement(By.linkText("Register")).click();
//		By registerlink=By.linkText("Register");
//		eleUtil.doClick(registerlink);

// 		7.partialLinkText: only for links: can be duplicate

//		driver.findElement(By.partialLinkText("Forgotten")).click();

//		8.tagName: HTML tag: can be duplicate
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		By header=By.tagName("h2");
		String h1=eleUtil.doGetElementText(header);
		System.out.println(h1);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
		
	}

}
