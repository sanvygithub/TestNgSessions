package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenCartMenuTest extends BaseTest {

	@DataProvider
	public Object[][] MenuData() {
		return new Object[][] {

				{ "Login" }, { "Register" }, { "Forgotten Password" }, { "My Account" }, { "Address Book" },
				{ "Wish List" }, { "Order History" }, { "Downloads" }, { "Recurring payments" }, { "Reward Points" },
				{ "Returns" }, { "Transactions" }, { "Newsletter" },

		};
	}

	@Test(dataProvider = "MenuData")
	public void MenuList(String Menu) {
		String Text = driver.findElement(By.linkText(Menu)).getText();

		Assert.assertEquals(Text, Text);

	}

}
