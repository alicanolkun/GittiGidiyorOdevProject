package Test;

import Base.BasePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginPageTest extends BaseTest {


    @Test
    public void successLoginTest() throws InterruptedException {
        homePage.navigateToLoginPage();
        loginPage.loginOl();
        //Assert.assertEquals("");

    }
}
