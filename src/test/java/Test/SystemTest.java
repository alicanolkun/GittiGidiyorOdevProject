package Test;

import Base.BasePage;
import org.junit.Test;

public class SystemTest extends BaseTest{

    @Test
    public void AllScenarios() throws InterruptedException {
        homePage.navigateToLoginPage();
        loginPage.loginOl();
        homePage.urunAra();
    }

}
