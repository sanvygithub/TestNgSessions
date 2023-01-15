package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		// driver.findElement(By.xpath("//a[text()=19]")).click();
		// selectDate("12");
		selectCalendarDate("22");

	}

	static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}

	}

	public static void selectFutureDate(String expMonthYear, String Day) {

		if (Integer.parseInt(Day) <= 0) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + Day);
			return;
		}
		if (Integer.parseInt(Day) > 31) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + Day);
			return;
		}
		if (expMonthYear.contains("February")) {
			if (isLeapYear(Integer.parseInt(expMonthYear.trim().split("")[1]))) {
				if (Integer.parseInt(Day) >= 30)
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in Leap year..."
									+ Day);
				return;

			} else {
				if (Integer.parseInt(Day) >= 29) {
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in year..." + Day);
					return;
				}
			}
		}

		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);

		while (!(actMonthYear.equalsIgnoreCase("December"))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);

		}

		selectDate(Day);

	}

	public static void selectDate(String Day) {
		driver.findElement(By.xpath("//a[text()='" + Day + "']")).click();
	}

	public static void selectCalendarDate(String Day) {
		List<WebElement> dayList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(dayList.size());
		for (WebElement e : dayList) {
			String Text = e.getText();
			if (Text.equals(Day)) {
				e.click();
				break;

			}

		}

	}

	// div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)
	// -- 15
	// div.DayPicker-Day--selected - current date
	// div.DayPicker-Day:not(.DayPicker-Day--outside) -- dates from both the months
	// div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled)
	// -- only enabled dates from both the months

}
