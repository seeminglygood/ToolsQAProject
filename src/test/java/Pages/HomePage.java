package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

   // Page elements:
    @FindBy (xpath="//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFramesWindows;
    @FindBy (xpath = "//h5[text()='Forms']")
    private WebElement forms;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;

    public void alertsFramesWindowsClick(){
        alertsFramesWindows.click();
        LoggerUtility.info("The user clicks on Alerts, Frame & Windows button.");
    }
    public void formsClick(){
        forms.click();
        LoggerUtility.info("The user clicks on Forms button.");
    }
    public void clickElements(){
        elements.click();
        LoggerUtility.info("The user clicks on Elements button.");
    }

}
