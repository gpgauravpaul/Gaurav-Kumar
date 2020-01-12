package Selenium_Stuff.Selenium_4_Stuffs;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClass1 {

	public WebDriver driver;
	
	
	@Test
	
	public void Locator1() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		if(element.isDisplayed())
		{
			element.click();
		}
		else {
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
		
		driver.findElement(By.className("nav-action-inner")).click();
		}
		
		driver.quit();
		
		System.out.println("Redirected to Login Page successfully.");

}
	
	@Test
	
	public void irctc() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement element = driver.findElement(By.id("loginText"));
		
		if(element.isDisplayed())
		{
			element.click();
			
		}
		else
		{
			driver.findElement(By.xpath("//*[@class='h_menu_drop_button hidden-xs']")).click();
		driver.findElement(By.className("search_btn")).click();
		driver.findElement(By.cssSelector("input#userId")).sendKeys("g0512");
		driver.findElement(By.cssSelector("input#pwd")).sendKeys("gmc201");
		System.out.println("Break");
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.cssSelector("img#captchaImg"));
		System.out.println(element1.getText());
		driver.findElement(By.cssSelector("button.search_btn")).click();
			
		}
	}
	
}