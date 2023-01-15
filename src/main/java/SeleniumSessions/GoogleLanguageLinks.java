package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

//		List<WebElement> GoogleLanguages = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		for (WebElement e : GoogleLanguages) {
//			String Lang = e.getText();
//			System.out.println(Lang);
//			if (Lang.contains("తెలుగు")) {
//				e.click();
		// break;
//			}
//		}

	By lang = (By.xpath("//div[@id='SIvCob']/a"));
	String name = "తెలుగు";
	doClickElement(lang, name);
	
	
	}
	public static void doClickElement(By Locator, String Text) {

		List<WebElement> tot_links = driver.findElements(Locator);
		System.out.println(tot_links.size());
		for (WebElement e : tot_links) {
			String Link = e.getText();
			System.out.println(Link);
			if (Link.contains(Text)) {
				e.click();
			}
		}
	}

}
