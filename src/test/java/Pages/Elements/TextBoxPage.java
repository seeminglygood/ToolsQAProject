package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public void fillTextBoxForm(String username, String email, String address, String permaAddress) {
        fillUserName(username);
        fillUserEmail(email);
        fillCurrentAddress(address);
        fillPermanentAddress(permaAddress);
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,450)", "");
        clickSubmit();
    }

    ;

    public void fillUserName(String username) {
        elementsMethods.fillElement(userName, username);
    }

    public void fillUserEmail(String email) {
        elementsMethods.fillElement(userEmail, email);
    }

    public void fillCurrentAddress(String address) {
        elementsMethods.fillElement(currentAddress, address);
    }

    public void fillPermanentAddress(String permaAddress) {
        elementsMethods.fillElement(permanentAddress, permaAddress);
    }

    public void clickSubmit() {
        elementsMethods.clickElement(submit);
    }

    public void validateTextBox(String username, String email, String address, String permaAddress) {
        String text = output.getText();
        Assert.assertTrue(text.contains("Name:" + username));
        Assert.assertTrue(text.contains("Email:" + email));
        Assert.assertTrue(text.contains("Current Address :" + address));
        Assert.assertTrue(text.contains("Permananet Address :" + permaAddress));
        System.out.println(text);
    }

}
