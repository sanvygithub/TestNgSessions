package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuGetText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		WebElement MainMenu = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(MainMenu).build().perform();

		List<WebElement> Level1 = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		for (int i = 0; i < Level1.size(); i++) {
			String Text = Level1.get(i).getText();
			System.out.println(Text);

			Actions actions1 = new Actions(driver);
			actions1.moveToElement(Level1.get(i)).build().perform();
			List<WebElement> Level2 = driver.findElements(By.xpath("(//ul[contains(@class,'nav nav-pills ')])[2]/li"));
			for(int j=0;j<Level2.size();j++) {
			String Text1 = Level2.get(j).getText();
			System.out.println(Text1);
			
			Actions actions2 = new Actions(driver);
			actions2.moveToElement(Level2.get(j)).build().perform();
			List<WebElement> Level3 = driver.findElements(By.xpath("(//div[@class='box']/ul[@class='list-unstyled'])[3]//a"));
			for(int k=0;k<Level3.size();k++) {
				String Text2=Level3.get(k).getText();
				System.out.println(Text2);
				
//				if(Text2.equals("Kiwi, Melon, Citrus Fruit")) {
//					Level3.get(k).click();
//					break;
				
			}
			
			
			}

		}

	}

}
