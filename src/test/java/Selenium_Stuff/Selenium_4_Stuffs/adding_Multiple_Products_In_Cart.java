package Selenium_Stuff.Selenium_4_Stuffs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
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
