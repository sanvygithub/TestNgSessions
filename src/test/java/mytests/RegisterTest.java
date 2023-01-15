package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

	@DataProvider

	public Object[][] registration_Data() {
		return new Object[][] {

				{ "Vastavi", "sandy", "sanju@gmail.com", "9080567878", "vastavi123", "vastavi123" },
				// {"venkat","kishoreS","Kittu@1gmail.com","9043212122","Kittu123","Kittu123"},
		};
	}

	@Test(dataProvider = "registration_Data")
	public void userRegistrationTest(String firstname, String lastname, String email, String Telephone,
			String password,String ConfirmPassword) {

		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);

		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);

		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(Telephone);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);

		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(password);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();

		Assert.assertEquals(Message, "Your Account Has Been Created!");

	}

}
