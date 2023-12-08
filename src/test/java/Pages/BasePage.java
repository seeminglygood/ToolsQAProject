package Pages;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.FrameMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// serveste ca fundatie pentru celelalte page classes
// are ca scop sa incapsuleze functionalitati comune intre mai multe pagini ale aplicatiei
public class BasePage {
    public WebDriver driver;
    public AlertsMethods alertsMethods;

    public ElementsMethods elementsMethods;
    public FrameMethods frameMethods;
    public WindowMethods windowMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        //initializes class elements with PageFactory pattern with the provided webdriver instance
        PageFactory.initElements(driver, this);
        // instantiates helper method classes with the provided webdriver instance
        alertsMethods = new AlertsMethods(driver);
        elementsMethods = new ElementsMethods(driver);
        frameMethods = new FrameMethods(driver);
        windowMethods = new WindowMethods(driver);


    }
}
