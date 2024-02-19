import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

public class HomePage extends PageBase{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    By checkUserName = By.id("tv_user_name");
    By history = By.id("nav_attendances");
    By backButton = By.xpath("//android.widget.ImageButton");
    By item = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.flowtechtics.erp:id/rv_attendances\"]/androidx.cardview.widget.CardView[3]");
    By salary = By.id("nav_my_salary");
    By accInfo = By.id("btn_account_info");
    By yourTeam = By.id("btn_your_team");
    By memberTeam = By.id("rv_team_members");
    By specifcMember = By.xpath("(//android.widget.TextView[@resource-id='com.flowtechtics.erp:id/tv_user_name'])[6]");
    By scrollObject = By.id("tv_balance");
    By otherTeam = By.id("btn_other_teams");
    AccountInfo info;


    public void getHomePage() {
        waitForVisibility(driver.findElement(checkUserName));
    }
    public void historyPage() {
        getHomePage();
        click(driver.findElement(history));
//        waitForVisibility(driver.findElement(item));
//        scroll_Down(driver.findElement(item));
//        waitForVisibility(driver.findElement(specificDay));
//        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
//        touchAction.tap(ElementOption.element(driver.findElement(specificDay))).perform();
        click(driver.findElement(backButton));
    }

    public void salaryPage() throws InterruptedException {
        getHomePage();
        click(driver.findElement(salary));
        Thread.sleep(3000);
        scroll_Down(driver.findElement(By.id("com.flowtechtics.erp:id/tv_insurance")));
        action.tap(ElementOption.element(driver.findElement(By.id("com.flowtechtics.erp:id/btn_view_history")))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.ImageButton")).click();
        Thread.sleep(2000);
        click(driver.findElement(backButton));
    }

    public void accountInfoPage() throws InterruptedException {
        getHomePage();
        click(driver.findElement(accInfo));
        Thread.sleep(2000);
        info = new AccountInfo(driver);
        info.getBasicInfoPage();
        info.getWorkTeamPage();
        info.getSalaryInfoPage();
        info.getNationalIdPage();
        click(driver.findElement(backButton));
    }
    public void yourTeamPage() {
        getHomePage();
        click(driver.findElement(yourTeam));
        waitForVisibility(driver.findElement(specifcMember));
        scroll_Down(driver.findElement(specifcMember));
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(ElementOption.element(driver.findElement(memberTeam))).perform();
        click(driver.findElement(backButton));
    }
    public void otherTeamPage() throws InterruptedException {
        getHomePage();
        waitForVisibility(driver.findElement(scrollObject));
        scroll_Down(driver.findElement(scrollObject));
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(ElementOption.element(driver.findElement(otherTeam))).perform();
        Thread.sleep(2000);
        click(driver.findElement(backButton));
    }
}
