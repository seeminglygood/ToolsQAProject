package Pages;
import HelpMethods.AlertsMethods;
import HelpMethods.ElementsMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
public WindowMethods windowMethods;
public AlertsMethods alertsMethods;
public FrameMethods frameMethods;
public ElementsMethods elementsMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethods = new WindowMethods(driver);
        alertsMethods = new AlertsMethods(driver);
        frameMethods = new FrameMethods(driver);
        elementsMethods = new ElementsMethods(driver);
    }
}
