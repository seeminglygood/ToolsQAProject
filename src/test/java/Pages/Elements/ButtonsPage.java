package Pages.Elements;

import org.openqa.selenium.WebDriver;
import Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickButton;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement clickMeButton;
    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;
    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    private WebElement clickMeMessage;


    public void clickAllButtons() {
        actionClickMeButton();
        validateClickMeAction();
        actionRightClickButton();
        validateRightClickAction();
        actionDoubleClickButton();
        validateDoubleClickAction();


    }

    public void actionDoubleClickButton() {
        elementsMethods.doubleClickElement(doubleClickButton);
    }

    public void actionRightClickButton() {
        elementsMethods.rightClickElement(rightClickButton);
    }

    public void actionClickMeButton() {
        elementsMethods.clickElement(clickMeButton);
    }


    private void validateDoubleClickAction() {
        Assert.assertEquals(doubleClickMessage.getText(), "Double Click Me");
    }

    private void validateRightClickAction() {
        Assert.assertEquals(rightClickMessage.getText(), "You have done a right click");
    }

    private void validateClickMeAction() {
        Assert.assertEquals(clickMeMessage.getText(), "You have done a dynamic click");
    }

}
