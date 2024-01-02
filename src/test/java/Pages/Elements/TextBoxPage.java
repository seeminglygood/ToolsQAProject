package Pages.Elements;

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
    private WebElement userName;

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
        elementsMethods.fillElement(userName, textBoxObject.getUsername());
        elementsMethods.fillElement(userEmail, textBoxObject.getEmail());
        elementsMethods.fillElement(currentAddress, textBoxObject.getAddress());
        elementsMethods.fillElement(permanentAddress, textBoxObject.getPermaAddress());
        elementsMethods.scrollByPixels(0, 450);
        elementsMethods.clickElement(submit);
    }


    public void validateTextBox(TextBoxObject textBoxObject) {
        String text = output.getText();
        Assert.assertTrue(text.contains("Name:" + textBoxObject.getUsername()));
        Assert.assertTrue(text.contains("Email:" + textBoxObject.getEmail()));
        Assert.assertTrue(text.contains("Current Address :" + textBoxObject.getAddress()));
        Assert.assertTrue(text.contains("Permananet Address :" + textBoxObject.getPermaAddress()));
        System.out.println(text);
    }

}
