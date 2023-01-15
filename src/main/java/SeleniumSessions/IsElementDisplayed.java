package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		boolean flag = driver.findElement(By.name("search")).isDisplayed();

//		if(flag) {
//			System.out.println("Element is dispalyed");
//		}
//		else {
//			System.out.println("Element is not dispaleyd");
//		}

		By search = By.name("search");
		By logo = By.xpath("//img[@title='naveenopencart']");
		
//		Boolean f=isDisplayed(search);
//		if(f) { System.out.println("Element is dispalyed");}
		
//		int eleCount=driver.findElements(search).size();
//		if(eleCount==1) {
//			System.out.println("Element is displayed");
//		}
		
		if(isSingleEleExists(search)) { System.out.println("Element is dispalyed");}
		if(isTwoEleExists(search)) { System.out.println("Element is dispalyed");}
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}
	
	public static List<WebElement> getElements(By Locator) {
	return	driver.findElements(Locator);
	}
	
	public static boolean isSingleEleExists(By locator) {
		int countEleList=getElements(locator).size();
		System.out.println("Count of elements:"+countEleList);
		if (countEleList==1) {
			return true;
		}
		return false;
		
	}
	
	public static boolean isTwoEleExists(By locator) {
		int countEleList=getElements(locator).size();
		System.out.println("Count of elements:"+countEleList);
		if (countEleList==2) {
			return true;
		}
		return false;
		
	}
	public static boolean isTwoEleExists(By locator,int knownvalue) {
		int countEleList=getElements(locator).size();
		System.out.println("Count of elements:"+countEleList);
		if (countEleList==knownvalue) {
			return true;
		}
		return false;
		
	}
	public static boolean isMultiEleExists(By locator) {
		int countEleList=getElements(locator).size();
		System.out.println("Count of elements:"+countEleList);
		if (countEleList>2) {
			return true;
		}
		return false;
		
	}

}
