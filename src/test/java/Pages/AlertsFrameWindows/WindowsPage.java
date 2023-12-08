package Pages.AlertsFrameWindows;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    WebElement newTabButton;
    @FindBy(id = "windowButton")
    WebElement newWindowButton;
    @FindBy(id = "messageWindowButton")
    WebElement newMessageWindowButton;


    public void interactTab(String initialURL, String expectedNewTabURL){
        elementsMethods.clickElement(newTabButton);
        windowMethods.switchToSpecificWindow(1);
        newTabCaseValidations(initialURL, expectedNewTabURL);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);
    }
    public void newTabCaseValidations(String initialURL, String expectedNewTabURL) {
        String newTabURL = driver.getCurrentUrl();
        Assert.assertTrue(newTabURL.equals(expectedNewTabURL));
        Assert.assertFalse(newTabURL.equals(initialURL));
        System.out.println(newTabURL);
    }

    public void interactNewWindow(String initialURL, String expectedNewWindowURL){
        elementsMethods.clickElement(newWindowButton);
        windowMethods.switchToSpecificWindow(1);
        newWindowCaseValidations(initialURL, expectedNewWindowURL);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);
    }

    public void newWindowCaseValidations(String initialURL, String expectedNewWindowURL) {
        String newWindowURL = driver.getCurrentUrl();
        Assert.assertTrue(newWindowURL.equals(expectedNewWindowURL));
        Assert.assertFalse(newWindowURL.equals(initialURL));
    }



}
