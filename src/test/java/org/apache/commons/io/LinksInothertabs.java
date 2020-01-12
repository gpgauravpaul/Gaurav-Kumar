package org.apache.commons.io;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInothertabs {
			
			public static WebDriver driver;
			
			static ArrayList<String> a = new ArrayList<>();
			
			
			public static void main(String[] args) {
			
				System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");	
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://qaclickacademy.com/practice.php");
				
				
			
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
					driver.getTitle();
					a.add(driver.getTitle());
				
				}
				System.out.println(a);
				Collections.sort(a);
				
				
				System.out.println("/*************** Sorted List ********************/");
				
				
				System.out.println(a);
				
				
				
				
	
		}
		}
