package Pages.AlertsFrameWindows;

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
    }
    public void browserWindowsClick(){
        elementsMethods.clickElement(browserWindows);
    }
    public void framesClick(){
        elementsMethods.clickElement(frames);
    }
}
