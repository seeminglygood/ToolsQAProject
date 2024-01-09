package Pages.Forms;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    WebElement practiceForm;

    public void practiceFormClick() {

        elementsMethods.clickElement(practiceForm);
        LoggerUtility.info("The user clicks on the 'Practice Form' button from the left side menu of the Forms page");
    }
}

