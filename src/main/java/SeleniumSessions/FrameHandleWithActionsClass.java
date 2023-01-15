package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FrameHandleWithActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://classic.crmpro.com/index.html");
		System.out.println(driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("CONTACTS"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.partialLinkText("New Contact"))).build().perform();
		
		List<WebElement>TitleName=driver.findElements(By.xpath("//select[@name='title']/option"));
		System.out.println(TitleName.size());
		
		for(WebElement e:TitleName) {
			String Text=e.getText();
			System.out.println(Text);
			
			if(Text.equals("Mr.")) {
				e.click();
				break;
			}
		}
		driver.findElement(By.id("first_name")).sendKeys("Kishore");
		driver.findElement(By.id("surname")).sendKeys("Venkat");
		
		//driver.findElement(By.id("image_file")).sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//input[@value='Lookup'])[2]")).click();
//		driver.switchTo().window(null)
//		
		
		driver.findElement(By.xpath("//form [@id='contactForm']//input[@value='Save']")).click();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
		
	}

}
