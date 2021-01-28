import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestRunner {

    private AppiumDriver<MobileElement> driver;

    @Test
    public void test()  {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            caps.setCapability(MobileCapabilityType.VERSION, "11");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\ApiDemos-debug.apk" );
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5555");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);

            driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            Thread.sleep(3000);
            driver.closeApp();

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
