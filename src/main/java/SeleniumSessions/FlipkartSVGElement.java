package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("q")).sendKeys("Asus Laptop");

		String Xpath = "//*[local-name()='svg']//*[name()='g']";
	//	String xpath = "//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']";
		By search = By.xpath(Xpath);
		
		//driver.findElement(search).click();
		
		Actions act=new Actions(driver);
		act.click(driver.findElement(search)).build().perform();
	}

}
