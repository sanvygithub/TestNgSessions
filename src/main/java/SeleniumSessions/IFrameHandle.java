package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		driver.switchTo().frame("frame-one748593425");
		
		By Id=By.id("RESULT_TextField-2");
		By VehicleType=By.id("RESULT_TextField-3");
		By VehicleModel=By.id("RESULT_TextField-4");
		
		
		
		doSendKeys(Id,"2019");
		doSendKeys(VehicleType, "Honda");
		doSendKeys(VehicleModel, "F-150-RX100");
		
		WebElement stateList=driver.findElement(By.id("RESULT_RadioButton-12"));
		
		Select s=new Select(stateList);
		s.selectByVisibleText("Indiana");
		
		driver.findElement(By.id("FSsubmit")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Log in")).click();
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By Locator,String Value) {
		getElement(Locator).sendKeys(Value);
	}

}
