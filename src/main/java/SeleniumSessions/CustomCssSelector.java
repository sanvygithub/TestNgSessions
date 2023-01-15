package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

// 		#id
// 		htmltag#id

// 		#input-email
//		input#input-email
		
		By.cssSelector("#input-email");
		
//		.class
//		.form-control
		
//		htmltag.class		
//		input.form-control	
		
		
//		#id.class
//		#input-email.form-control
//		.class#id
//		.form-control#input-email
		
//		htmltag.class#id
//		input.form-control#input-email
		
//		.c1.c2.c3....cn
//		.form-control.input-lg
		
//		htmltag.c1.c2.c3....cn
//		input.btn.btn-primary
//		input.form-control.input-lg
//		.form-control.private-form__control.login-email
//		input.form-control.private-form__control.login-email
//		input.login-email
		
// using other attributes other than id and class
		
//		htmltag[attr='value']
//		input[type='email']		-Css
//		//input[@type='email']	-xpath	
//		input[type='password']  -css
//		input[value='Login'][type='submit']    -css
//		//input[@value='Login' and @type='submit']  -xpath
		
//		htmltag[attr*='value]    - contains
//		input[placeholder*='E-Mail']  				-css
//		//input[contains(@placeholder,'E-Mail')]	-xpath
		
//     	htmltag[attr^='value']	-Starts-with
//		input[placeholder^='E-Mail']		-css
//		//input[starts-with(@placeholder,'E-Mail')]		-xpath
//     	htmltag[attr$='value']	-Ends with
//		input[placeholder$='Address']
//		input[placeholder$='Address'][id^='input'][type*='text']	
		
		//text? - no support in CSS
		
//		Parent to child 
		
//		select#Form_getForm_Country>option			(direct child elements)
//		select#Form_getForm_Country option			(direct child+Indirect child elements)
		
//		form#hs-login> div 	--->8
//		form#hs-login div 	--->20
		
		//child to parent: backward traversing not supported
		
//sibling in css:
//preceding sibling is not supported
		
	//	label[for='input-email']+input  -------folowing sibling
		
//comma in css:
				// input#username,input#password,button#loginBtn,input#remember -- 4
		
//		input#username,input#password,input#remember,button#loginBtn -4
		
		By Mand_eles=By.cssSelector("input#username,input#password,input#remember,button#loginBtn");
		
		int Mand_eles_count=driver.findElements(Mand_eles).size();
		
		if(Mand_eles_count==4) {
			
			System.out.println("Mandatory elements are available ");
		}
		else {
			System.out.println("Mandatory elements are not available ");
				
		}
		
		//indexing in css:
//		div.row ul.footer-nav li:nth-of-type(5)
		
		
		
		
		
		
		
		
		

	}

}
