package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Create webElement+perform action(click,sendkeys...)
		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// 2.
//		WebElement Email=driver.findElement(By.id("input-email"));
//		WebElement Pwd=driver.findElement(By.id("input-password"));
//		
//		Email.sendKeys("naveen@gmail.com");
//		Pwd.sendKeys("naveen@123");

//		3. By locator
//		By Email=By.id("input-email");
//		By Pwd=By.id("input-password");
//		
//		WebElement email= driver.findElement(Email);
//		WebElement pwd=driver.findElement(Pwd);
//		
//		email.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");

		// 4.By locator + generic function
		By Email = By.id("input-email");
		By Pwd = By.id("input-password");

//		getElement(Email).sendKeys("naveen@gmail.com");
//		getElement(Pwd).sendKeys("naveen@123");
		
//		doSendKeys(Email,"naveen@gmail.com");
//		doSendKeys(Pwd, "naveen@123");
		
		
		ElementUtil element=new ElementUtil(driver);
		element.doSendKeys(Email, "naveen@gmail.com");
		element.doSendKeys(Pwd, "naveen@123");
		
		
		
		
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	

}
