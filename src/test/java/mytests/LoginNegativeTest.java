package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

	@DataProvider
	public Object[][] loginNegativeData() {
		return new Object[][] {

				{ "sandhya@gmail.com", "sandy123" }, { "Kishore@gmail.com", "Naveen23" }, };
	}

	@Test(dataProvider = "loginNegativeData")
	public void loginNegativeTest(String Username, String Password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(Username);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String Text = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		Assert.assertTrue(Text.contains("No match for E-Mail Address and/or Password."));
	}
}
