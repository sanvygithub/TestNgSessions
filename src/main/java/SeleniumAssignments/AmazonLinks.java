package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int LinklistSize = Links.size();
		System.out.println(LinklistSize);
		int index = 0;
		for (WebElement e : Links) {
			String LinkText = e.getText();
			if (!(LinkText.length() == 0)) {
				System.out.println(index + " " + LinkText);
			}
			index++;
		}

		driver.get("https://www.google.co.in/");
		List<WebElement> LangList = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		System.out.println(LangList.size());
		for (WebElement e : LangList) {
			String Languages = e.getText();
			System.out.println(Languages);
			if (Languages.equals("తెలుగు")) {
				e.click();
				break;

			}

		}

		List<WebElement> links = driver.findElements(By.cssSelector(".KxwPGc.AghGtd>a"));
		for (WebElement e : links) {
			String Texts = e.getText();
			System.out.println(Texts);
			if (Texts.contains("Advertising")) {
				e.click();
				break;
			}

		}

	}

}
