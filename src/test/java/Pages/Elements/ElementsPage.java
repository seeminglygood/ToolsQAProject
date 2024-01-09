package Pages.Elements;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTables;

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement textBox;

    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement checkBox;

    @FindBy(xpath = "//span[text()='Radio Button']")
    private WebElement radioButton;

    @FindBy(xpath = "//span[text()='Buttons']")
    private WebElement buttons;

    public void clickWebTables() {
        elementsMethods.clickElement(webTables);
        LoggerUtility.info("The user clicks the 'Web Tables' button in the left-side menu of the 'Elements' page");
    }

    public void clickTextBox() {
        elementsMethods.clickElement(textBox);
        LoggerUtility.info("The user clicks the 'Text Box' button in the left-side menu of the 'Elements' page");
    }

    public void clickCheckBox(){
        elementsMethods.clickElement(checkBox);
        LoggerUtility.info("The user clicks the 'Web Tables' button in the left-side menu of the 'Elements' page");
    }
    public void clickRadioButton(){
        elementsMethods.clickElement(radioButton);
        LoggerUtility.info("The user clicks the 'Radio Button' button in the left-side menu of the 'Elements' page");

    }
    public void clickButtons(){
        elementsMethods.clickElement(buttons);
        LoggerUtility.info("The user clicks the 'Buttons' button in the left-side menu of the 'Elements' page");
    }
}

