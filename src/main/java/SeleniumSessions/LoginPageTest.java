package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser("chrome");

//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//
//		String Title = brUtil.getPageTitle();
//		if (Title.equals("Account Login")) {
//			System.out.println("Title is correct:" + Title);
//		} else {
//			System.out.println("Title is incorrect");
//		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String Title = brUtil.getPageTitle();
		if (Title.equals("Register Account")) {
			System.out.println("Title is correct:" + Title);
		} else {
			System.out.println("Title is incorrect");
		}

		ElementUtil element = new ElementUtil(driver);

//		By Email = By.id("input-email");
//		By Pwd = By.id("input-password");

//
//		element.doSendKeys(Email, "naveen@gmail.com");
//		element.doSendKeys(Pwd, "navven@123");

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Pwd = By.id("input-password");
		By PwdConfirm = By.id("input-confirm");

		element.doSendKeys(FirstName, "Sandhya");
		element.doSendKeys(LastName, "Kishore");
		element.doSendKeys(emailId, "sandhya@gmail.com");
		element.doSendKeys(Telephone, "9849809712");
		element.doSendKeys(Pwd, "Sandy@123");
		element.doSendKeys(PwdConfirm, "Sandy@123");

		brUtil.CloseBrowser();

	}

}
