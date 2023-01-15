package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		// 1.Absolute Xpath

//		/html/body/div[2]/div/div/div/div[1]/div/h2

		// 2. Custom relative Xpath

//		//htmltag[@Attr='value']

// 		//input[@name='email']

		// htmltag[@attr1='value and @attr2=value]

		// input[@name='email' and @placeholder='E-Mail Address']

//		3. //text():

		// htmltag[text()='value']

//		//h2[text()='New Customer']
		// a[text()='Returns']

//		4.	//text() and attribute:

		// htmltag[text()='value' and @attr='value"]

		// a[text()='Returns' and @class='list-group-item']

// 		5. //contains:
		// htmltag[contains(@attr,'value']

		// input[contains(@id,'password')]

		// <div id=firstname_123>
		// <div id=firstname_455>
		// <div id=firstname_457>

		// div[contains(@id,'firstname_')]

		// contains() with text():

		// htmltag[contains(text[],'value)]

		// a[contains(text(),'Amazon')] //20 (FE's)

//6.	//contains() with one attr and another attr without contains

		// htmltag[contains(@attr='value') and @attr2='value']

		// input[contains(@class,'form-control') and @name='email']
		
		
		//starts-with():
		//htmltag[starts-with(@attr,'value)]
		
		//input[starts-with(@placeholder,'E-Mail')]
		
		//input[starts-with(@placeholder,'E-Mail') and contains(@name,'email')]
		
		//input[starts-with(@placeholder,'E-Mail') and starts-with(@name,'email')]
		
		//input[starts-with(@placeholder,'First') and starts-with(@id,'input')]
		
		//a[starts-with(@class,'list') and contains(text(),'Register')]
		
		//ends-with:NA
		
		//indexing:
		
// 		(//htmltag[@attr1='value])[1]
//		By Login= By.xpath("//a[@class='list-group-item'])[1]");
//		By Register=By.xpath("//a[@class='list-group-item'])[2]");
		
//		(((//div[contains(@class,'row')])[4] )[last()]//a)[last()-1]
		
		//htmltag[@attr1='value']
		
	}
	

}
