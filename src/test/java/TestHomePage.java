import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestHomePage extends TestBase{
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void SuccessHistory () throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        homePage = new HomePage(driver);
        homePage.historyPage();
    }
    @Test
    public void SuccessSalary () throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        homePage = new HomePage(driver);
        homePage.salaryPage();
        tearDown();
    }
    @Test
    public void SuccessInfo () throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        homePage = new HomePage(driver);
        homePage.accountInfoPage();
        tearDown();
    }
    @Test
    public void SuccessYourTeam () throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        homePage = new HomePage(driver);
        homePage.yourTeamPage();
        tearDown();
    }
    @Test
    public void SuccessOtherTeam () throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        homePage = new HomePage(driver);
        homePage.otherTeamPage();
        tearDown();
    }
}
