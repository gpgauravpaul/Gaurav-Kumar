package Selenium_Stuff.Selenium_4_Stuffs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeWindowHandles {
	
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.cssSelector("[class='NlWrkb snByac']")).click();
		Thread.sleep(1000L);

		WebElement element  =  driver.findElement(By.className("jO7h3c"));
	element.click();
	Thread.sleep(3000L);
	driver.findElement(By.linkText("Help")).click();
	
	Set<String> set = driver.getWindowHandles();
	System.out.println(set);
	Iterator<String> it = set.iterator();
	
	String parent = it.next();
	String child = it.next();
	
	//Switching the window to Child
	
	driver.switchTo().window(child);
	

	
	WebElement element2 = driver.findElement(By.linkText("Google Account Help"));
		String str = element2.getText();
   System.out.println(str);		
		
	}
}
