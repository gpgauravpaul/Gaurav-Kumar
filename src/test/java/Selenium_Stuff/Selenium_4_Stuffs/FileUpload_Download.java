package Selenium_Stuff.Selenium_4_Stuffs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload_Download {

	public static WebDriver driver ; 
	
	public static void main(String[] args) throws IOException, InterruptedException {
			
	       
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.get("https://altoconvertpdftojpg.com/");
	   driver.findElement(By.xpath("//*[@id=\"dropzoneInput-label\"]")).click();
	   Thread.sleep(2000);
       Runtime.getRuntime().exec("C:\\Users\\saura\\Desktop\\FileUploadSection");
   	  Thread.sleep(7000);
   			   //visibilityOfElementLocated(""));  
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,200)");
       //Need to add wait
       driver.findElement(By.xpath("//button[text()='Convert Now!']")).click();
       System.out.println("love");
       Thread.sleep(8000);
   //    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Congratulations! Your Document is Ready!']"))));
       driver.findElement(By.xpath("//a[text()='Download Now']")).click();
	}
	}