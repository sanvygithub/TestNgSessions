package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebTable {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		// List<WebElement> rows = table.findElements(By.tagName("tr"));
		// List<WebElement> cols = table.findElements(By.tagName("td"));
//		System.out.println(rows.size());
//		for (WebElement e : rows) {
//			List<WebElement> cols = e.findElements(By.tagName("td"));
//			for (WebElement f : cols) {
//				System.out.println(f.getText());
//			}
//
//		}
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String Text = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+ (i + 1) + "]/td[" + j + "]"))
						.getText();
				System.out.println(Text);
//				if (Text.equals("Austria")) {
//					System.out.println(i + ":" + j);
//					break;
//				}

			}

		}

	}

}
