package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlertTypes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alertBtn =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement confirmBtn =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement promptBtn =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		alertBtn.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		confirmBtn.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		//alert1.dismiss();
		
		promptBtn.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("I am Sandy");
		Thread.sleep(2000);
		alert2.accept();
		
		

	}

}
