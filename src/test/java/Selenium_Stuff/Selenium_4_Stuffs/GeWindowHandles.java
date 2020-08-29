package Selenium_Stuff.Selenium_4_Stuffs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GeWindowHandles {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
 	//	driver.findElement(By.cssSelector("[class='NlWrkb snByac']")).click();
		WebElement element  =  driver.findElement (By.xpath ("//a[text()='Help']"));
    	element.click();
	    Thread.sleep(3000L);

		Set<String> s= driver.getWindowHandles ();
	    Iterator<String> i = s.iterator ();
//        String parent = i.next ();
//	      String child = i.next ();
		while(i.hasNext ()) {

		String iterate = i.next ();
		String present = driver.findElement (By.xpath ("//div[@id='material-bar-custom-product-name']/a")).getText ();
		if(present.equalsIgnoreCase ("Google Account Help")) {
			System.out.println ("Win");
		driver.switchTo ().window (iterate);
	    break; } }
		System.out.println (driver.findElement (By.xpath ("//a[text()='Google Account Help']")).getText ()); }}