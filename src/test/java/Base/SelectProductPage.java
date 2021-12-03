package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductPage extends BasePage {

    By lastElement = driver.findElement(By.xpath("(//*[@data-cy='product-favorite'])[32]"));

    // css selector fav = [class='sc-1n49x8z-14 fIkZfb']

    public SelectProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    
    By lastElement = driver.findElement(By.xpath("(//*[@data-cy='product-favorite'])[32]"));
    int y = lastElement.getLocation().getY();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollTo(0,"+y+")");
    Thread.sleep(3000);

    }



