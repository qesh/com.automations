import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class base {


    public static AndroidDriver<MobileElement> Capabilities() throws MalformedURLException, InterruptedException {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            caps.setCapability(MobileCapabilityType.VERSION, "9");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\ApiDemos-debug.apk" );
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator_pixel");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            Thread.sleep(3000);
            //driver.closeApp();


        return driver;
    }


}
