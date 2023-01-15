package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Images {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.navigate().refresh();

//		List<WebElement>TotalImages=driver.findElements(By.tagName("img"));
//		System.out.println(TotalImages.size());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		int counter = 0;
		for (WebElement i : links) {
			String href = i.getAttribute("href");
			if (!(href==null)) {
				System.out.println(counter + "=" + href);
			}
			counter++;
		}

//		for(WebElement e: TotalImages) {
//			String Alt=e.getAttribute("alt");
//			String src=e.getAttribute("src");
//			System.out.println(Alt +"||"+src);
//		}

//		for (int i=0;i<TotalImages.size();i++) {
//			String Alt=TotalImages.get(i).getAttribute("alt");
//			String src=TotalImages.get(i).getAttribute("src");
//			System.out.println(Alt +"||" +src);
//			//System.out.println(src);
//		}

	}

}
