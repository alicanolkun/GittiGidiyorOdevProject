package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    By accountOptions=By.cssSelector("[title='Giriş Yap'] .gekhq4-4");
    By loginPageGirisYapButtonLocator=By.cssSelector("[data-cy='header-login-button']");

    By textBoxLocator=By.className("sc-14oyvky-0");
    By searchButtonLocator=By.className("sc-1bydi5r-0");
    By page1Locator=By.cssSelector("[class='sc-12aj18f-0 glRpjV']");


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void navigateToLoginPage() throws InterruptedException {
        moveToElement(accountOptions);
        Thread.sleep(2000);
        clickToElement(loginPageGirisYapButtonLocator);

    }
    public void urunAra()throws InterruptedException{
        sendText(textBoxLocator,"bardak");
        Thread.sleep(2000);
        clickToElement(searchButtonLocator);
        Thread.sleep(2000);
    }

}
