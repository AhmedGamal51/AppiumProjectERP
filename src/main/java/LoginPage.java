import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    By userName = By.id("et_user_name");
    By password =By.id("et_password");
    By logIn= By.id("btn_login");

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void setLogIn() throws InterruptedException {
        Thread.sleep(3000);
        sendText(driver.findElement(userName), "test_10@flowtechtics.com");
        sendText(driver.findElement(password), "123456789");
        click(driver.findElement(logIn));
        Thread.sleep(2000);
    }
}
