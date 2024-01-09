package Pages.AlertsFrameWindows;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    WebElement OKAlertButton;
    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;
    @FindBy(id = "confirmButton")
    WebElement confirmAlertButton;
    @FindBy(id = "promtButton")
    WebElement promptAlertButton;

    public void interactAlertOK() {
        elementsMethods.clickElement(OKAlertButton);
        LoggerUtility.info("The user clicks on the 1st Click me Button, for the simple Alert; alert displayed.");
        alertsMethods.acceptAlert();
        LoggerUtility.info("The user clicks on the alert OK button, alert accepted.");
    }

    public void interactTimerAlert() {
        elementsMethods.clickElement(timerAlertButton);
        LoggerUtility.info("The user clicks on the 2nd Click me Button, for the timer Alert; alert displayed after 5 sec.");
        alertsMethods.acceptAlert();
        LoggerUtility.info("The user clicks on the timer alert OK button, alert accepted.");
    }

    public void cancelConfirmAlert() {
        elementsMethods.clickElement(confirmAlertButton);
        LoggerUtility.info("The user clicks on the 3rd Click me Button, for the confirm Alert; alert displayed.");
        alertsMethods.cancelAlert();
        LoggerUtility.info("The user clicks on the confirm alert Cancel button, alert dismissed.");
    }
    public void acceptConfirmAlert() {
        elementsMethods.clickElement(confirmAlertButton);
        LoggerUtility.info("The user clicks on the 3rd Click me Button, for the confirm Alert; alert displayed.");
        alertsMethods.acceptAlert();
        LoggerUtility.info("The user clicks on the confirm alert OK button, alert accepted.");
    }

    public void fillPromptAlert(AlertObject alertObject) {
        elementsMethods.clickElement(promptAlertButton);
        LoggerUtility.info("The user clicks on the 4th Click me Button, for prompt Alert; alert displayed.");
        alertsMethods.fillAlert(alertObject.getPromptAlertValue());
        LoggerUtility.info("The user enters text in the alert field and clicks on the OK button; text submitted and alert closed.");
    }
    public void cancelPromptAlert() {
        elementsMethods.clickElement(promptAlertButton);
        LoggerUtility.info("The user clicks on the 4th Click me Button, for prompt Alert; alert displayed.");
        alertsMethods.cancelAlert();
        LoggerUtility.info("The user clicks on the prompt alert Cancel button, alert dismissed.");

    }
}
