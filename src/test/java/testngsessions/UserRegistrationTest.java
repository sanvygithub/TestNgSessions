package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegistrationTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@Test(description = "user Registration")
	public void UserDetailsTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("Sandhya1");
		driver.findElement(By.id("input-lastname")).sendKeys("Kakarla1");
		driver.findElement(By.id("input-email")).sendKeys("Sandhya1263@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9812345672");
		driver.findElement(By.id("input-password")).sendKeys("Sandhya1233");
		driver.findElement(By.id("input-confirm")).sendKeys("Sandhya1233");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();

		Assert.assertEquals(Message, "Your Account Has Been Created!");

	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();

	}
}
