package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableColumnText {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		Thread.sleep(4000);

		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		
		//a[text()='Kishore Venkat' and @context ='contact' ]/parent::td/preceding-sibling::td/input

		System.out.println(getuserCompanyName("Kishore Venkat"));
		System.out.println(getuserCompanyName("Romi singh"));
		System.out.println(getuserCompanyName("Ali khan"));
		
		
	}
	
	public static String getuserCompanyName(String username) {
		String CompanyName=driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
		return CompanyName;
		
	}

}
