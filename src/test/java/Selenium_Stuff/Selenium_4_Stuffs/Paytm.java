package Selenium_Stuff.Selenium_4_Stuffs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		int counter = driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();

		WebElement next = driver.findElement(
				By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last'] //*[@data-handler='next']"));

		WebElement element = driver.findElement(By.className("ui-datepicker-month"));

		// ui-datepicker-group ui-datepicker-group-first

		while (true) {

			System.out.println(element.getText());
			driver.findElement(By.cssSelector("[title='Thursday']")).click();
			next.click();

			System.out.println(element.getText());

			Thread.sleep(5000L);

		}

	}
}
