package Pages.AlertsFrameWindows;

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
        alertsMethods.acceptAlert();
    }

    public void interactTimerAlert() {
        elementsMethods.clickElement(timerAlertButton);
        alertsMethods.acceptAlert();
    }

    public void interactConfirmAlert() {
        elementsMethods.clickElement(confirmAlertButton);
        alertsMethods.cancelAlert();
    }

    public void interactPromptAlert() {
        elementsMethods.clickElement(promptAlertButton);
        alertsMethods.fillAlert("hahaha");
    }
}
