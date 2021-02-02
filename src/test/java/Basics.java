import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends base{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver = Capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Wifi");
        driver.findElement(By.id("android:id/button1")).click();

    }
}
