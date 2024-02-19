import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AccountInfo extends PageBase{
    public AccountInfo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    By basicInfo = By.id("btn_basic_information");
    By nationalId = By.id("btn_national_identity");
    By salaryInfo = By.id("btn_salary");
    By viewSalary =By.id("tv_view");
    By workTeam = By.id("btn_work_team");
    By backButton = By.xpath("//android.widget.ImageButton");

    public void getBasicInfoPage() throws InterruptedException {
        click(driver.findElement(basicInfo));
        Thread.sleep(1000);
        click(driver.findElement(backButton));
    }
    public void getNationalIdPage() throws InterruptedException {
        click(driver.findElement(nationalId));
        Thread.sleep(1000);
        click(driver.findElement(backButton));
    }
    public void getSalaryInfoPage() throws InterruptedException {
        click(driver.findElement(salaryInfo));
        Thread.sleep(1000);
        click(driver.findElement(viewSalary));
        Thread.sleep(1000);
        click(driver.findElement(backButton));
    }
    public void getWorkTeamPage() throws InterruptedException {
        click(driver.findElement(workTeam));
        Thread.sleep(1000);
        click(driver.findElement(backButton));
    }
}
