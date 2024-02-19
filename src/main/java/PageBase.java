import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    AppiumDriver driver;
    TouchAction action;

    public static final Duration WAIT = Duration.ofSeconds(2);
    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }
    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clear(WebElement element){
        waitForVisibility(element);
        element.clear();
    }
    public void click(WebElement element){
        waitForVisibility(element);
        element.click();
    }
    public void sendText(WebElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }
    public String getAttribute(WebElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
    public void scroll_Down(WebElement element){
        waitForVisibility(element);
        int startX = element.getLocation().getX();
        int startY = element.getLocation().getY();

        int endX = startX;
        int endY= startY - 800;
        action = new TouchAction((PerformsTouchActions) driver);
        action.press(ElementOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(ElementOption.point(endX, endY))
                .release()
                .perform();
    }
}
