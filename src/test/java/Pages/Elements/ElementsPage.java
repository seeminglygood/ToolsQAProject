package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    }

    public void clickTextBox() {
        elementsMethods.clickElement(textBox);
    }

    public void clickCheckBox(){
        elementsMethods.clickElement(checkBox);
    }
    public void clickRadioButton(){
        elementsMethods.clickElement(radioButton);

    }
    public void clickButtons(){
        elementsMethods.clickElement(buttons);
    }
}

