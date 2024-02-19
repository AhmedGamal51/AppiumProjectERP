import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestLoginPage extends TestBase{
    LoginPage loginPage;

    @Test
    public void successLogin() throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        loginPage.setLogIn();
        tearDown();
    }
}
