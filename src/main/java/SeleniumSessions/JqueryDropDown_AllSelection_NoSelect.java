package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown_AllSelection_NoSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

//		List<WebElement> choices=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(choices.size());//45

		By choice = By.xpath("//span[@class='comboTreeItemTitle']");
		// single choice
		// doGetChoices(choice,"choice 1");

		// Multiple choice
		// doGetChoices(choice, "choice 1", "choice 2", "choice 2 1");

		// Select all choices
		// doGetChoices(choice, "all");

		// select option not in list
		doGetChoices(choice, "choice 9");

	}

	/**
	 * this method is handling single, multiple and all choices selection this
	 * method is also handling if choice is not available please pass the choices
	 * which are present in case of multiple choice selection
	 * please pass"all"(identifier)in case of all selection 
	 * @param locator
	 * @param value
	 */

	public static void doGetChoices(By locator, String... value) {

		List<WebElement> choices = driver.findElements(locator);
		boolean flag = false;
		if (!(value[0].equalsIgnoreCase("all"))) {
			for (WebElement e : choices) {
				String Text = e.getText();
				// System.out.println(Text);
				for (int i = 0; i < value.length; i++) {
					if (Text.equals(value[i])) {
						flag = true;
						e.click();
						break;
					}

				}

			}

		} else {
			try {
				for (WebElement e : choices) {
					e.click();
					flag = true;
				}
			} catch (Exception e) {

			}

		}
		if (flag == false) {
			System.out.println("Option not found:" + value[0]);
		}

	}

}
