package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	@BeforeSuite
	public void connecWithDB() {
		System.out.println("BS--connecWithDB");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BT--launchBrowser");
	}
	@BeforeClass
	public void createUser() {
		System.out.println("BC--createUser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM--login");
	}
	
	@Test
	public void homePage() {
		System.out.println("homePage");
	}
	
	@Test
	public void search() {
		System.out.println("Search");
		
	}
	@Test
	public void cart() {
		System.out.println("cart");
		
	}
	@AfterMethod
	public void logOut() {
		System.out.println("AM--logout");
	}
	@AfterClass
	public void delUser() {
		System.out.println("AC--delUser");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("AT--closeBrowser");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--disconnectDB");
	}
	
	
}
