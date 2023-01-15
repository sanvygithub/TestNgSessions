package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		WebElement S = driver.findElement(By.id("Form_getForm_Country"));

//		Select e = new Select(S);
//
//		List<WebElement> options = e.getOptions();
//		System.out.println(options.size());
//		int Counter = 0;
//		for (WebElement k : options) {
//			String optionsList = k.getText();
//			System.out.println(Counter + "=" + optionsList);
//			if (optionsList.equals("India")) {
//				k.click();
//				break;
//			}
//			Counter++;
//		}
		
		By Country=By.id("Form_getForm_Country");
		doGetOptions(Country, "Australia");
		
		
	}

	public static void doGetOptions(By locator,String value) {
		WebElement S=getElement(locator);
		
		Select e = new Select(S);
		
		List<WebElement> options = e.getOptions();
		System.out.println(options.size());
		int Counter = 0;
		for (WebElement k : options) {
			String optionsList = k.getText();
			System.out.println(Counter + "=" + optionsList);
			if (optionsList.equals(value)) {
				k.click();
				break;
			}
			Counter++;
		}
		

	}

	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}

}
