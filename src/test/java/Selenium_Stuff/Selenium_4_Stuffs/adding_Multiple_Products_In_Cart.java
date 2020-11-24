package Selenium_Stuff.Selenium_4_Stuffs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adding_Multiple_Products_In_Cart {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to ("https://the-internet.herokuapp.com/dynamic_loading/1");
	    driver.findElement (By.xpath ("//*[text()='Start']")).click ();
	    // Fluent Wait
		WebElement element = driver.findElement(By.id ("finish"));
		WebElement element1 = driver.findElement(By.id ("finish"));
		Wait wait  = new FluentWait (driver).withTimeout (Duration.ofSeconds (5)).pollingEvery (Duration.ofSeconds (2))
				.ignoreAll (Collections.singleton (Exception.class));

		wait.until (ExpectedConditions.or (ExpectedConditions.elementToBeClickable (element),ExpectedConditions.visibilityOf(element1)));


		String str = element.getText ();
		System.out.println (str +" "+element.isDisplayed () );



		
	}
	
	
@Test
public void test() throws InterruptedException {
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	String[] itemValues = {"Cucumber","Beetroot","Raspberry"};
	testing(itemValues);

}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Test
	public static void testing(String[] itemValues) throws InterruptedException {
		
		
		
		
		int count = driver.findElements(By.cssSelector("h4.product-name")).size();
		
		for(int i=0;i<count;i++)
		{
			
			String item = driver.findElements(By.cssSelector("h4.product-name")).get(i).getText();			
			String item1[] = item.split(" - ");
			 String Final = item1[0].trim();
			System.out.println(Final);
			

			List<String> list = Arrays.asList(itemValues);
			
			

			if(list.contains(Final))
			{
				System.out.println(i);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
			}	
		}	
	}
}
