package Selenium_Stuff.Selenium_4_Stuffs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Window_Authentication_PopUp {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
      // Follow this below line.
        driver.get ("https://www.spicejet.com");
        List<WebElement> web = driver.findElements(By.xpath("//*[@type='checkbox']"));
        int size = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
        System.out.println (size);

        for(int i=0;i<size;i++)
        {
         boolean b = driver.findElements(By.xpath("//*[@type='checkbox']")).get (i).isSelected ();
         if(b==false)
         {

             driver.findElements(By.name("ctl00$mainContent$chk_friendsandfamily")).get (i).click ();
             break;
         }
        }
    }
}
