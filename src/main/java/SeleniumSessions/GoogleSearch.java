package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		//List<WebElement>SuggList=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		//System.out.println(SuggList.size());
		
//		for(WebElement e:SuggList) {
//			String Text=e.getText();
//			System.out.println(Text);
//			if(Text.equals("selenium testing")) {
//				e.click();
//				break;
//			}
//			
//		}
		By Search =By.xpath("//div[@class='wM6W7d']/span");
		doGetList(Search, "selenium testing");
		

	}
	public static void doGetList(By Locator,String value) {
		List<WebElement>SuggList=driver.findElements(Locator);
		for(WebElement e:SuggList) {
			String Text=e.getText();
			System.out.println(Text);
			if(Text.contains(value)) {
				e.click();
				break;
			}
			
		}
		
	}
	
	

}
