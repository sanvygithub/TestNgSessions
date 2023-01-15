package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class openCartTest {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}
	@Test(description="Checking for the Page Title",priority=2,invocationCount=5)
	public void titleTest() {
		String Title =driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Account Login","...Ttile is not present");
	}
	@Test(description="Checking for the Logo",priority=1)
	public void logoTest() {
		boolean flag=driver.findElement(By.cssSelector("div #logo  img")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

}
