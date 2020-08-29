package Miscellaneous_Topics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TakeScreenshot_Selenium {

    public static void main (String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        File file = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile(file, new File ("path"));

    }
}
