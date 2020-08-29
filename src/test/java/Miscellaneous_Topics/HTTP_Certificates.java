package Miscellaneous_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;

public class HTTP_Certificates {

    public static void main (String[] args) {

        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS,true);
        d.setCapability (CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c = new ChromeOptions();
        c.merge (d);
        WebDriver diver = new ChromeDriver(c);



    }
}
