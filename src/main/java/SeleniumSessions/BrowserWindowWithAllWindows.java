package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
	String parentWid =	driver.getWindowHandle();
	
		
		WebElement Lkdele=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbele=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twiele=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytbele=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		
		
		Lkdele.click();
		Thread.sleep(1000);
		fbele.click();
		twiele.click();
		ytbele.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it =handles.iterator();
		
		while(it.hasNext()) {
			
			String windowid=it.next();
			driver.switchTo().window(windowid);
			System.out.println(driver.getCurrentUrl());
			
			if (!(windowid.equals(parentWid))) {
				driver.close();
				
			}
				
					
		}
		driver.switchTo().window(parentWid);

	}

}
