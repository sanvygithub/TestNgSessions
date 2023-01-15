package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeTest

	public void setup(String url, String browserName) {

		System.out.println("launching browser : " + browserName);
		// ChromeOptions co=new ChromeOptions();

//		if (browserName.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browserName.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browserName.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else {
//			System.out.println("plz pass the right browser...." + browserName);
//		}

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			// co.setHeadless(Boolean.parseBoolean(headless));
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("please pass the right browser:" + browserName);
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
