package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.Amazon.com");
		//driver.navigate().to(new URL ("https://www.google.com") );
		driver.navigate().back();
		System.out.println("google");
		driver.navigate().forward();
		System.out.println("Amazon");
		driver.navigate().back();
		driver.navigate().refresh();
		

		String Title = driver.getTitle();
		System.out.println("Page Title is:" + Title);

		if (Title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
		//driver.quit();

	}

}
