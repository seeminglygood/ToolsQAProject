package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath="//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertsFramesWindows;
    @FindBy (xpath = "//h5[text()='Forms']")
    WebElement forms;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;

    public void alertsFramesWindowsClick(){
        alertsFramesWindows.click();
    }
    public void formsClick(){
        forms.click();
    }
    public void clickElements(){
        elements.click();
    }

}
