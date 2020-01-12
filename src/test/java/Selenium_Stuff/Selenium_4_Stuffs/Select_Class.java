package Selenium_Stuff.Selenium_4_Stuffs;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Class {

	
	public static WebDriver driver;
	
	
	
	@Test
	public void testss() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		int count =  driver.findElements(By.cssSelector("[class='radioButton']")).size();
		List<WebElement> element = driver.findElements(By.cssSelector("[class='radioButton']"));
		WebElement element1 = driver.findElement(By.cssSelector("[class='radioButton']"));
		
	
		
		for(int i=0;i<count;i++)
		{
	   
	     
	     String str = element.get(i).getAttribute("value");
	     System.out.println(str);
	     
	     if(str.equals("radio1"))
	     {
	    	 element.get(i).click();
	     break;
	     }
		}

		WebElement element2 = driver.findElement(By.cssSelector("[id='dropdown-class-example']"));
		
		Select sel = new Select(element2);
		sel.selectByIndex(0);
		
		
		
		
		
		
		
	
	}
}
