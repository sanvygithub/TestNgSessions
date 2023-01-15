package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithNoSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		 driver=new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
//		List<WebElement>CountryList=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println(CountryList.size());
//		int count=0;
//		for(WebElement country:CountryList) {
//			String Name=country.getText();
//			System.out.println(count+"="+Name);
//			if(Name.equals("India")) {
//				country.click();
//				break;
//			}
//			count++;
//		}
		By Country=By.xpath("//select[@id='Form_getForm_Country']/option");
		
		doGetList(Country,"Zaire");

	}
	
	
	public static void doGetList(By Locator,String name) {
		List<WebElement>CountryList=driver.findElements(Locator);
		System.out.println(CountryList.size());
		int count=0;
		for(WebElement country:CountryList) {
			String Name=country.getText();
			System.out.println(count+"="+Name);
			if(Name.equals(name)) {
				country.click();
				break;
			}
			count++;
		}
		
	}

}
