package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandleuUsingList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		WebElement Lkdele=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		Lkdele.click();
		
		
		//1.Set
		Set<String>handles=driver.getWindowHandles();
		//2.List
		List<String>handlesList=new ArrayList<String>(handles);
		String ParentId=handlesList.get(0);
		String ChildId=handlesList.get(1);
		
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentId);
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
