package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class ElementsMethods {
    private WebDriver driver;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void waitVisibleElement(WebElement element, Integer waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        waitVisibleElement(element, 10);
        element.click();
    }

    public void clickJSElement(WebElement element) {
        waitVisibleElement(element, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void rightClickElement(WebElement element){
        waitVisibleElement(element, 10);
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    public void doubleClickElement(WebElement element){
        waitVisibleElement(element, 10);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public void fillElement(WebElement element, String value) {
        waitVisibleElement(element, 10);
        element.sendKeys(value);
    }

    public void fillElement(WebElement element, String value, Keys keyboardPress) {
        waitVisibleElement(element, 10);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);
    }

    public void fillElement(WebElement element, String value, String keyboardPress) {
        waitVisibleElement(element, 10);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);
    }


    public void uploadFile(WebElement element, String pathname) {
        File file = new File(pathname);
        element.sendKeys(file.getAbsolutePath());
    }

    public void scrollByPixels(Integer x, Integer y) {
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public void validateElementMessage(WebElement element, String value) {
        waitVisibleElement(element, 10);
        String actualMessage = element.getText();
        Assert.assertEquals(actualMessage, value);
    }


}
