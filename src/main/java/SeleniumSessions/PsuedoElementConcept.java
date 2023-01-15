package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content');
		
		JavascriptExecutor js=	(JavascriptExecutor)driver;
		
		String Mand_text = js.executeScript(" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')").toString();
		System.out.println(Mand_text);
		
		if(Mand_text.contains("*")) {
		System.out.println("Mandatory field is available");
		}
		
	}
	

}
