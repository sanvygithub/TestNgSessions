package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");
		driver.findElement(By.xpath("//input[@class=\"comboTreeInputBox\"]")).click();
		Thread.sleep(3000);
		By Choices = By.xpath("//span[@class=\"comboTreeItemTitle\"]");
		// doSelectchoices(Choices, "choice 2 3");
		// doSelectchoices(Choices, "choice 1", "choice 2", "choice 2 3");
		doSelectchoices(Choices, "all");
		// doSelectchoices(Choices, "choice 9");

	}

	/*
	 * This method can be used for single checkbox selection ,multiple selection and
	 * for all checkbox selections
	 * 
	 * @param Locator
	 * @param choices
	 * 
	 * 
	 */

	public static void doSelectchoices(By Locator, String... choices) {

		List<WebElement> choicesList = driver.findElements(Locator);
		boolean flag = false;
		if (!choices[0].equalsIgnoreCase("all")) {
			for (WebElement e : choicesList) {
				String Text = e.getText();
				for (int i = 0; i < choices.length; i++) {
					if (Text.equals(choices[i])) {
						flag = true;
						e.click();
						break;
					}
				}
			}

		} else {
			try {
				for (WebElement e : choicesList) {
					flag = true;
					e.click();
				}
			} catch (Exception e) {

			}

		}
		if (flag == false) {
			System.out.println("Element is not in the list" + "" + choices[0]);
		}

	}

}
