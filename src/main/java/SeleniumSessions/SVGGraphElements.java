package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String xpath="//*[local-name()='svg'  and @id='map-svg']//*[name()='g' and @id='features']//*[name()='path']";
		
		By states=By.xpath(xpath);
		
		List<WebElement> StatesList=driver.findElements(states);
		System.out.println(StatesList.size());
		
		Actions act=new Actions(driver);
		
		for(WebElement e:StatesList) {
			String Name=e.getAttribute("name");
			System.out.println(Name);
			
			if(Name.equals("Florida")) {
				act.click(e).build().perform();
				
				break;
				
			}
			
			
		}
		

	}

}
