package Pages.Elements;

import Logger.LoggerUtility;
import ObjectData.TextBoxObject;
import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    private WebElement fullName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "output")
    private WebElement output;

    public void fillTextBoxForm(TextBoxObject textBoxObject) {
        elementsMethods.fillElement(fullName, textBoxObject.getUsername());
        LoggerUtility.info("The user fills in the Full Name: " + fullName);
        elementsMethods.fillElement(userEmail, textBoxObject.getEmail());
        LoggerUtility.info("The user fills in the Email: " + userEmail);
        elementsMethods.fillElement(currentAddress, textBoxObject.getAddress());
        LoggerUtility.info("The user fills in the Current Address: " + currentAddress);
        elementsMethods.fillElement(permanentAddress, textBoxObject.getPermaAddress());
        LoggerUtility.info("The user fills in the Permanent Address: " + permanentAddress);
        elementsMethods.scrollByPixels(0, 450);
        LoggerUtility.info("The user scrolls the page so the Submit button is visible");
        elementsMethods.clickElement(submit);
        LoggerUtility.info("The user clicks the Submit button");
    }


    public void validateTextBoxDataEntry(TextBoxObject textBoxObject) {
        Assert.assertTrue(output.isDisplayed());
        LoggerUtility.info("The Output section is displayed under the input fields and the Submit button");
        String text = output.getText();
        Assert.assertTrue(text.contains("Name:" + textBoxObject.getUsername()));
        LoggerUtility.info("The Output contains the correct Name");
        Assert.assertTrue(text.contains("Email:" + textBoxObject.getEmail()));
        LoggerUtility.info("The Output contains the correct Email");
        Assert.assertTrue(text.contains("Current Address :" + textBoxObject.getAddress()));
        LoggerUtility.info("The Output contains the correct Current Address");
        Assert.assertTrue(text.contains("Permananet Address :" + textBoxObject.getPermaAddress()));
        LoggerUtility.info("The Output contains the correct Permanent Address");
    }

}
