import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiautomateTest extends  base{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        int size = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
        System.out.printf("Size of clickable " + size);

    }


}
