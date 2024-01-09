package Pages.AlertsFrameWindows;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    WebElement newTabButton;
    @FindBy(id = "windowButton")
    WebElement newWindowButton;
    @FindBy(id = "messageWindowButton")
    WebElement newMessageWindowButton;
    // define variables for tests
    String initialURL = "https://demoqa.com/browser-windows";
    String expectedURL = "https://demoqa.com/sample";


    public void interactTab(){
        elementsMethods.clickElement(newTabButton);
        LoggerUtility.info("The user clicks on the 'New Tab' button; a new tab opens");
        windowMethods.switchToSpecificWindow(1);
        LoggerUtility.info("The focus is switched to the new tab");
        newTabCaseValidations();
        windowMethods.closeCurrentWindow();
        LoggerUtility.info("The user closes the new tab");
        windowMethods.switchToSpecificWindow(0);
        LoggerUtility.info("The focus is switched back to the original window");
    }
    public void newTabCaseValidations() {
        String newTabURL = driver.getCurrentUrl();
        Assert.assertTrue(newTabURL.equals(expectedURL));
        Assert.assertFalse(newTabURL.equals(initialURL));
        System.out.println(newTabURL);
        LoggerUtility.info("The URl of the new tab is correct and different from the one of the original page");
    }

    public void interactNewWindow(){
        elementsMethods.clickElement(newWindowButton);
        LoggerUtility.info("The user clicks on the 'New Window' button; a new window opens");
        windowMethods.switchToSpecificWindow(1);
        LoggerUtility.info("The focus is switched to the new window");
        newWindowCaseValidations();
        windowMethods.closeCurrentWindow();
        LoggerUtility.info("The user closes the new window");
        windowMethods.switchToSpecificWindow(0);
        LoggerUtility.info("The focus is switched back to the original window");
    }

    public void newWindowCaseValidations() {
        String newWindowURL = driver.getCurrentUrl();
        Assert.assertTrue(newWindowURL.equals(expectedURL));
        Assert.assertFalse(newWindowURL.equals(initialURL));
        LoggerUtility.info("The URl of the new window is correct and different from the one of the original page");
    }



}
