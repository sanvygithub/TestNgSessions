package SeleniumSessions;

public class XPathAxes {

	public static void main(String[] args) {
		
		//parent to child:
		
		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//child to parent
		
		//div[@class='private-form__input-wrapper']/../../../../..
		//div[@class='private-form__input-wrapper']/..
		//input[@id='username']/parent::div
		//input[@id='username']/parent::div/parent::div
		
		
		//div[@class='form-group']/input[@id='input-email']/preceding-sibling::label
		//input[@id='input-email']/preceding-sibling::label
		
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		
		//div[text()='Make Money with Us']/following-sibling::ul//a
		//div[text()='Make Money with Us']/following-sibling::ul//child::a
		
		xPath("Make Money with Us");
		
		//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		

	}
	
	public static String xPath(String username) {
		String xpath= "//div[text()='"+username+"']/following-sibling::ul//a";
		return xpath;
		
	}

}
