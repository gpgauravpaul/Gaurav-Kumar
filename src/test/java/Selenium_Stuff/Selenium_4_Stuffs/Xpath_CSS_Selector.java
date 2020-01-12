package Selenium_Stuff.Selenium_4_Stuffs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

public class Xpath_CSS_Selector {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?ir=1");
	
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("[id ='username']")).sendKeys("testing world");
        driver.findElement(By.cssSelector("input#password")).sendKeys("tester1");
        driver.findElement(By.cssSelector("#Login")).click();
        
        
        FluentWait wait = new FluentWait(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"error\"]"));
        wait.until(ExpectedConditions.visibilityOf(element));
        
       
        System.out.println(element);
       
       
       System.out.println(" Thanks to God. ");
       
       
       
		
		
		
		
	}
	
	
}
