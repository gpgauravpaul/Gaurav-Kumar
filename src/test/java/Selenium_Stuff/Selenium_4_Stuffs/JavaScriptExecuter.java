package Selenium_Stuff.Selenium_4_Stuffs;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecuter {

    public static WebDriver driver;
    public static void main (String[] args) {

         System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript ("window.scrollBy(0,400)");
         driver.findElement (By.xpath ("//input[@id='fromPlaceName']")).sendKeys ("Ban");
        String strt = "return document.getElementById('fromPlaceName').value;";
        String final1 =(String)jse.executeScript (strt);
        while(!final1.equalsIgnoreCase ("BANGALORE"))
        {
            driver.findElement (By.xpath ("//input[@id='fromPlaceName']")).sendKeys (Keys.ARROW_DOWN);
            final1 =(String)jse.executeScript (strt);
            System.out.println (final1);
        }
        driver.findElement (By.xpath ("//input[@id='fromPlaceName']")).sendKeys (Keys.ENTER);
        int count = driver.findElements (By.xpath ("//a[@class='ui-corner-all']")).size ();
//        if (driver.findElements (By.xpath ("//a[@class='ui-corner-all']")).get (i).getText ().equalsIgnoreCase ("BANGALORE"))
//        {
//            driver.findElements (By.xpath ("//a[@class='ui-corner-all']")).get (i).click ();
//            break;
//        }
        }


     //   driver.findElement (By.xpath ("//input[@id='fromPlaceName']")).sendKeys (Keys.ARROW_DOWN);
    }

