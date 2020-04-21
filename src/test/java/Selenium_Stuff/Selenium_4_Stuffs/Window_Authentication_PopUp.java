package Selenium_Stuff.Selenium_4_Stuffs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Authentication_PopUp {

    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
      // Follow this below line.
        driver.get ("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement (By.xpath("//*[@id='content']/ul/li[3]/a")).click ();
        
    }

}
