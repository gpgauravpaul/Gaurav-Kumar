package Selenium_Stuff.Selenium_4_Stuffs;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksInothertabs {
	
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		
		System.out.println(utility("Popular"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String utility(String Variable)
	{
		
		
		WebElement ee = driver.findElement(By.xpath("//*[@class='gf-t']"));

		for(int i=1;i<5;i++)
		{
			
			WebElement e = ee.findElements(By.tagName("a")).get(i); 
		String str = Keys.chord(Keys.COMMAND,Keys.ENTER);
		e.sendKeys(str);
		
		}
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> i = set.iterator();
		
		while(i.hasNext())
		{
			String str = i.next();
			driver.switchTo().window(str);
			
			if(driver.getTitle().contains(Variable))
			{
				break;
			}
		
		}
		
		return driver.getTitle();
}
}