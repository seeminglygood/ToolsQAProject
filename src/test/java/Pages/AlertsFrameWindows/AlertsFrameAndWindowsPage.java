package Pages.AlertsFrameWindows;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsFrameAndWindowsPage extends BasePage {

    public AlertsFrameAndWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[text()= 'Alerts']")
    public WebElement alerts;
    @FindBy (xpath = "//span[text()= 'Browser Windows']")
    WebElement browserWindows;
    @FindBy(xpath = "//span[text()= 'Frames']")
    WebElement frames;

    public void alertsClick(){
        elementsMethods.clickElement(alerts);
        LoggerUtility.info("The user clicks on the Alerts button from the left side menu.");
    }
    public void browserWindowsClick(){
        elementsMethods.clickElement(browserWindows);
        LoggerUtility.info("The user clicks on the Browser Windows button from the left side menu.");
    }
    public void framesClick(){
        elementsMethods.clickElement(frames);
        LoggerUtility.info("The user clicks on the Frames button from the left side menu.");
    }
}
