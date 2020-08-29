package Miscellaneous_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

    public static void main (String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage ().deleteAllCookies ();
        driver.manage ().deleteCookieNamed ("Cookie name");


    }
}
