package Selenium_Stuff.Selenium_4_Stuffs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class FileDownload {
    public static class Action {

        public static WebDriver driver ;

        public static void main(String[] args) throws InterruptedException {

            String path  = System.getProperty ("user.dir");
            System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", path);
            ChromeOptions o = new ChromeOptions();
            o.setExperimentalOption ("prefs",chromePrefs);
            driver = new ChromeDriver (o);
            driver.manage().window().maximize();
            driver.navigate ().to ("https://www.selenium.dev/downloads/");
            driver.findElement (By.linkText("32 bit Windows IE")).click ();
            Thread.sleep (2000);
            File file = new File (path+"/"+"IEDriverServer_Win32_3.150.1");
            System.out.println (file);
            Thread.sleep (2000);
            if (file.exists ())
            {
                System.out.println ("File has been successfully downloaded");
            }
            else
                {
                System.out.println ("Something wrong with downloading process");
            }
//Login screen appears ---
        }}
}
