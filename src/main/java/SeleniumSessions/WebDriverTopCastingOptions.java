package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTopCastingOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();

			break;

		default:
			System.out.println();
			break;
		}

		driver.get("https://www.amazon.com");

		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.contains("Amazon")) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect");
		}
		driver.quit();

	}

}
