package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\DELL\\Downloads\\firefoxdriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Launch the correct browser");
			break;

		}
		return driver;

	}

	public void getUrl(String Url) {

		if (Url == null) {
			System.out.println("Url is null");
			throw new FrameworkException("URL IS NULL");
		}
		if(Url.length()==0) {
			System.out.println("Url empty ");
			throw new FrameworkException("URL IS EMPTY");
		}
		if(Url.indexOf("http")!=0 && Url.indexOf("https")!=0) {
			System.out.println("Http(s) is missing");
			throw new FrameworkException("HTTP(S) is Missing");
		}
		driver.get(Url);
	}
	
	public void getUrl(URL Url) {
		String NewUrl=String.valueOf(Url);

		if (NewUrl == null) {
			System.out.println("Url is null");
			throw new FrameworkException("URL IS NULL");
		}
		if(NewUrl.length()==0) {
			System.out.println("Url empty ");
			throw new FrameworkException("URL IS EMPTY");
		}
		if(NewUrl.indexOf("http")!=0 && NewUrl.indexOf("https")!=0) {
			System.out.println("Http(s) is missing");
			throw new FrameworkException("HTTP(S) is Missing");
		}
		driver.navigate().to(Url);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public void CloseBrowser() {
		driver.close();

	}

}