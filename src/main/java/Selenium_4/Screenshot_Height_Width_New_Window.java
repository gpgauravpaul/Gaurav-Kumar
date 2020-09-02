//package Selenium_4;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Screenshot_Height_Width_New_Window {
//
//    public static void main (String[] args) {
//
//
//    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//
//    WebDriver driver=new ChromeDriver ();
//
//driver.get("https://rahulshettyacademy.com/angularpractice/");
//
////Switching Window
//
//driver.switchTo().newWindow(WindowType.WINDOW);
//
//    Set<String> handles=driver.getWindowHandles();
//
//    Iterator<String> it=handles.iterator();
//
//    String parentWindowId = it.next();
//
//    String childWindow =it.next();
//
//driver.switchTo().window(childWindow);
//
//driver.get("https://rahulshettyacademy.com/");
//
//    String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
//
//            .get(1).getText();
//
//driver.switchTo().window(parentWindowId);
//
//    WebElement name=driver.findElement(By.cssSelector("[name='name']"));
//
//name.sendKeys(courseName);
//
////Screenshot
//
//    File file=name.getScreenshotAs(OutputType.FILE);
//
//FileUtils.copyFile(file, new File("logo.png"));
//
////driver.quit();
//
////GEt Height & Width
//
//System.out.println(name.getRect().getDimension().getHeight());
//
//System.out.println(name.getRect().getDimension().getWidth());
//
//
//}
//}