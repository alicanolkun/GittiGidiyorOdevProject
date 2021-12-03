package Test;

import Base.BasePage;
import Base.HomePage;
import Base.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest  {
    protected WebDriver driver;
    protected WebDriverWait wait;
    BasePage basePage;
    HomePage homePage;
    LoginPage loginPage;

    @Before
    public void setUpa(){


        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");

        basePage=new BasePage(driver,wait);
        homePage=new HomePage(driver,wait);
        loginPage=new LoginPage(driver,wait);



    }


    @After
    public void tearDown(){
        //driver.close(); // pencere kapatır
       // driver.quit(); //kill yapar
    }


}
