package Selenium_Stuff.Selenium_4_Stuffs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class error {

	
	public static void main(String[] args) throws InterruptedException {
		

		
	System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	WebElement frame1 = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame1);

	WebElement element = driver.findElement(By.id("draggable"));	
	Actions act = new Actions(driver);
	act.moveToElement(element).dragAndDropBy(element, 150, 40).build().perform();
	driver.switchTo().defaultContent();
	String test =  driver.findElement(By.className("entry-title")).getText();
	System.out.println(test);
	
	
	
	
	
	
}
}