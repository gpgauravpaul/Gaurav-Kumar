package Selenium_Stuff.Selenium_4_Stuffs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static WebDriver driver ; 
	
	public static void main(String[] args) throws IOException, InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//*[@id=\"dropzoneInput-label\"]")).click();
		Thread.sleep(2000);
       Runtime.getRuntime().exec("C:\\Users\\saura\\Desktop\\FileUploadSection");
       Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@contains(@class,'g-btn--primary')]")).click();
        WebElement element = driver.findElement(By.xpath("//*[text()='Congratulations! Your Document is Ready!']"));
         WebDriverWait wait = new WebDriverWait(driver,10);
         wait.until(ExpectedConditions.visibilityOf(element));
         driver.findElement(By.xpath("outputResultComponent--button")).click();
         
         
	
	
	
	}}