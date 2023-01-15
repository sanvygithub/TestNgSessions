package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.launchBrowser("chrome");

		brUtil.getUrl("http:www.google.com");
		
		String ActTitle = brUtil.getPageTitle();
		
		if (ActTitle.contains("Amazon")) {
			System.out.println("Title is correct");
		} 
		else {
			System.out.println("Title is incorrect");
		}
		brUtil.CloseBrowser();

	}

}
