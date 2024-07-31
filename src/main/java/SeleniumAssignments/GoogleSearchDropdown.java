package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(3000);
//		List<WebElement> SuggList = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
//		// (By.cssSelector(".wM6W7d>span"));
//		System.out.println(SuggList.size());
//		for (WebElement e : SuggList) {
//			String Text = e.getText();
//			System.out.println(Text);
//			if(Text.equalsIgnoreCase("selenium testing")) {
//				e.click();
//				break;

//			}
//			
//		}

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
//		WebElement e = driver.findElement(By.id("Form_getForm_Country"));
//		Select s = new Select(e);
//		s.selectByIndex(1);
//		s.selectByValue("American Samoa");
//		s.selectByVisibleText("Angola");

// Selecting a drop down value Without using Select
		List<WebElement> CountryList = driver.findElements(By.xpath("//select[@id=\"Form_getForm_Country\"]/option"));
		int counter=1;
		for (WebElement e : CountryList) {
			String Text = e.getText();
			System.out.println(counter +" = "+ Text);
			if (Text.equals("Bangladesh")) {
				e.click();
				break;
				
		}
			counter++;
		}

	}

}
