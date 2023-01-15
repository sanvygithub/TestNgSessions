package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String Title = driver.getTitle();
		System.out.println("Page Title is:" + Title);

		if (Title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.quit();
	}

}
