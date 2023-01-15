package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		String Title=js.executeScript("return document.title").toString();
//		System.out.println(Title);

		JavaScriptUtil js = new JavaScriptUtil(driver);
//		System.out.println(js.getTitleByJS());

//		String Text=js.getPageInnerText();
//		System.out.println(Text);
//		if(Text.contains("Dresses")) {
//			System.out.println("Pass");
//		}
//		js.refreshBrowserByJS();
//		
//		js.generateAlert("Hello Amazon");
//		Alert alert=driver.switchTo().alert();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		alert.accept();
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement Features=driver.findElement(By.xpath("//aside[@id='column-right']"));
//		js.drawBorder(email);
//		js.drawBorder(Features);
//		
//		js.flash(email);
//		email.sendKeys("sanju@gmail.com");
//		js.flash(Features);

//		js.scrollPageDown();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		js.scrollPageUp();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		js.scrollPageDown("300");
//		
//		WebElement GymTools=driver.findElement(By.xpath("//h2[text()='For your Fitness Needs']"));
//		js.scrollIntoView(GymTools);
		
		WebElement careers=driver.findElement(By.linkText("Careers"));
		js.clickElementByJS(careers);
	}

}
