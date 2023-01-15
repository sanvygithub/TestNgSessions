package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowOnebyOne {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		WebElement Lkdele=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		//WebElement fbele=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));

		Lkdele.click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentWindowID=it.next();
		String childWindowID=it.next();
		
		driver.switchTo().window(childWindowID);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		WebElement twele=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twele.click();
		Thread.sleep(1000);
		Set<String>handles1=driver.getWindowHandles();
		Iterator<String>it1=handles1.iterator();
		String parentWindowID1=it1.next();
		String childWindowID1=it1.next();
		
		driver.switchTo().window(childWindowID1);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID1);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		

		

	}

}
