package Appium_iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumInvocation {

     public IOSDriver driver;
    public IOSDriver app_invoke() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability (MobileCapabilityType.DEVICE_NAME,"iPhone 7");
        dc.setCapability (MobileCapabilityType.PLATFORM_NAME,"iOS");
//        dc.setCapability (MobileCapabilityType.PLATFORM_VERSION,"13.1");
        dc.setCapability (MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        dc.setCapability (MobileCapabilityType.APP,"/Users/gaurav.pauloutlook.in/Library/Developer/Xcode/DerivedData/UIKitCatalog-cvzxpgikbevkqiezcjuyaznzjvkz/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        driver = new IOSDriver(new URL ("http://127.0.0.1:4723/wd/hub"),dc);
  return driver;

    }


}
