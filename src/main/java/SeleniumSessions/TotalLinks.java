package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		// 1.total links
		// 2.print the text of each link
		// 3.Avoid printing blank link text

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// driver.manage().window().fullscreen();

		List<WebElement> LinksList = driver.findElements(By.tagName("a"));
		System.out.println(LinksList.size());

//		for (int i = 0; i < LinksList.size(); i++) {
//			String linksText = LinksList.get(i).getText();
//			if (!(linksText.length() == 0)) {
//				System.out.println(i + " " + "=" + linksText);
//			}
//		}
		int counter=0;
		for (WebElement e : LinksList) {
			String LinkText = e.getText();
			if (!(LinkText.length() == 0)) {
				System.out.println(counter+"="+LinkText);
			}
			counter++;
		}
	}

}
