package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		WebElement fbele=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		fbele.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentWindowId=it.next();
		System.out.println("ParentWindowid :"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("childWindowid :"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("childwindow:"+driver.getCurrentUrl());
		driver.close();
		

		driver.switchTo().window(parentWindowId);
		System.out.println("parentwindow:"+driver.getCurrentUrl());
		driver.quit();
		
		

	}

}
