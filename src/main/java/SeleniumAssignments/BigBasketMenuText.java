package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		
		WebElement L1=driver.findElement(By.xpath("(//a[text()='Fruits & Vegetables'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(L1).build().perform();

	}

}
