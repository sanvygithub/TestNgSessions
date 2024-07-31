package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelct {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		List<WebElement> CountryList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

//		for (WebElement e : CountryList) {
//			String CountryText = e.getText();
//			System.out.println(CountryText);
//			if (CountryText.trim().equals("Canada")) {
//				e.click();
//				break;
//			}
//		}

	}

}
