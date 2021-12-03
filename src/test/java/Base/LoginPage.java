package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    By emailyolu=By.id("L-UserNameField");
    By passyolu=By.id("L-PasswordField");
    By button=By.id("gg-login-enter");
    By cookiesLokator=By.className("tyj39b-5");


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void loginOl() throws InterruptedException {
        sendText(emailyolu,"denemeeagle2000@gmail.com");
        Thread.sleep(1000);
        sendText(passyolu,"Test1234");
        //clickToElement(cookiesLokator);
        Thread.sleep(1000);
        clickToElement(button);

    }
}
