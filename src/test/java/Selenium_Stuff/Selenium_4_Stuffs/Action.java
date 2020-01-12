package Selenium_Stuff.Selenium_4_Stuffs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	
	public static WebDriver driver ; 
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("test").doubleClick(element).build().perform();
		
	}
	
}
