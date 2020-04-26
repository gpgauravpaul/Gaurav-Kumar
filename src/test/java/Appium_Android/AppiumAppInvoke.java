package Appium_Android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAppInvoke {

    @Test
    public void AppInvoke_a() throws MalformedURLException {
        DesiredCapabilities d = new DesiredCapabilities();
         d.setCapability (MobileCapabilityType.DEVICE_NAME,"Android Device");
         d.setCapability (MobileCapabilityType.UDID,"37c26ece7d94");
         d.setCapability (MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
         d.setCapability (MobileCapabilityType.APP,"/Volumes/Software_Collection/original.apk");

       AndroidDriver driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"),d);

    }
}