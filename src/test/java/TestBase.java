import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AppiumDriver driver;
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","9.0");
        caps.setCapability("deviceName","Android Emulator");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("app",System.getProperty("user.dir")+"/apps/app-debug.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
    }
    public void tearDown() throws InterruptedException {
        if (null != driver) {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
