package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMethods {
    private WebDriver driver;

    public AlertsMethods(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForAlert(Integer waitTime){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void acceptAlert(){
        waitForAlert(10);
        Alert timerAlert = driver.switchTo().alert();
        timerAlert.accept();
    }
    public void cancelAlert(){
        waitForAlert(10);
        Alert alertConfirm =  driver.switchTo().alert();
        alertConfirm.dismiss();
    }
    public void fillAlert(String keysToSend){
        waitForAlert(10);
        Alert promptAlert =  driver.switchTo().alert();
        promptAlert.sendKeys(keysToSend);
        promptAlert.accept();

    }
}
