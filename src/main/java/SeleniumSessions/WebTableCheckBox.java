package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCheckBox {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		
		userCheckBox("Jasmine.Morgan");
		userCheckBox("Joe.Root");
		
		List<WebElement> userDetails=driver.findElements(By.xpath("//a[text()='John.Smith']/parent::td/following-sibling::td"));
		for(WebElement e: userDetails) {
			String Text=e.getText();
			System.out.println(Text);
		}
		

	}
	
	public static void userCheckBox(String username) {
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
