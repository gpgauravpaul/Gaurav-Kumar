package Selenium_Stuff.Selenium_4_Stuffs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicWebTables {
    public static void main (String[] args) throws InterruptedException {
        table ("S&P BSE 200");
    }

public static void table (String str) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/gaurav.pauloutlook.in/Downloads/chromedriver");
WebDriver driver = new ChromeDriver ();
driver.manage().window().maximize();
driver.navigate().to ("https://money.rediff.com/index.html/indices");
JavascriptExecutor jse = (JavascriptExecutor)driver;
WebElement element = driver.findElement(By.xpath ("//*[@id=\"wrapper\"]/div[9]/div[9]/div[1]/h2/b"));
jse.executeScript ("arguments[0].scrollIntoView(true);",element);
driver.findElement (By.xpath ("//*[@id=\"div_bseindices\"]/div/div/p/a")).click ();
driver.findElement (By.id ("showMoreLess")).click ();
WebElement element1 = driver.findElement (By.xpath ("//*[@id=\"leftcontainer\"]/div[1]"));
jse.executeScript ("arguments[0].scrollIntoView(true);",element1);
WebElement subdriver = driver.findElement(By.id ("dataTable"));
int count = subdriver.findElements (By.xpath ("//*[@id='dataTable']//tr//td[1]")).size (); //indices count
for (int i=1;i<=count;i++)
{
String str2 = subdriver.findElement (By.xpath ("//*[@id='dataTable']//tr["+i+"]//td[1]")).getText ();
        if (str.equals(str2))
        {
            System.out.println (subdriver.findElement (By.xpath ("//*[@id='dataTable']//tr["+i+"]//td[3]")).getText ());
            break;
        }
    }}}