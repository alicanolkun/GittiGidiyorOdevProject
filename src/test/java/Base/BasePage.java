package Base;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }




    public void clickToElement(By locator) {
        isElementVisible(locator); //Element gözükene kadar bekler
        isElementClickable(locator);   //Element clickable olana kadar bekler
        findElement(locator).click();
    }

    public void sendText(By locator, String text) {
        isElementVisible(locator);
        findElement(locator).sendKeys(text);
    }

//    public void clickElement(WebElement webElement) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
//        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
//    }

    public boolean isElementClickable(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean isElementVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getText(By locator){
        isElementVisible(locator);
      return  findElement(locator).getText();
    }

    public String getElementValue(By locator,String elementValue){
        return findElement(locator).getAttribute(elementValue);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public void moveToElement(By actionLocator){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(actionLocator)).build().perform();
        isElementVisible(actionLocator);
        //actions.moveToElement(findElement(actionLocator)).clickAndHold().pause(2000).click().build().perform();
    }


        }






