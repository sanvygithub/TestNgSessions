package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPopUp {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/");

		//driver.get("https://" + "admin" + ":" + "admin" + "@" + "the-internet.herokuapp.com/basic_auth");
		
		if(doLogin("admin", "admin", "the-internet.herokuapp.com/basic_auth")) {
			System.out.println("Logged in Successfully");
		}
		else {
			System.out.println("Log in Unsuccessful");
			
		}

	}

	public static boolean doLogin(String username, String password, String url) {
		driver.get("https://" + username + ":" + password +"@"+ url);
		WebElement Message=driver.findElement(By.xpath("//div[@class='example']//p"));
		String msg=Message.getText();
		
		if(msg.contains("Congratulations! You must have the proper credentials")) {
			return true;
		}
		return false;

	}
}
