package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		
		// browser will not be displayed
		// Testing is happening behind the scene
		// Slightly faster than the normal one
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		//co.setHeadless(true);
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
