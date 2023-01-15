package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.findElement(By.xpath("/html/body/h2"));
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String Header=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(Header);

		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}

}
