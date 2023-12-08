package Pages.Elements;

import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualEntries;

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "salary")
    private WebElement salary;

    @FindBy(id = "department")
    private WebElement department;
    @FindBy(id = "submit")
    private WebElement submit;


    public void addNewEntry(WebTableObject webTableObject) {

        Integer actualTableSize = actualEntries.size();
        elementsMethods.clickElement(addButton);
        elementsMethods.fillElement(firstName, webTableObject.getFirstNameValue());
        elementsMethods.fillElement(lastName, webTableObject.getLastNameValue());
        elementsMethods.fillElement(email, webTableObject.getEmailValue());
        elementsMethods.fillElement(age, webTableObject.getAgeValue());
        elementsMethods.fillElement(salary, webTableObject.getSalaryValue());
        elementsMethods.fillElement(department, webTableObject.getDepartmentValue());
        elementsMethods.clickElement(submit);

        validateNewEntry(actualTableSize, webTableObject);
    }

    private void validateNewEntry(Integer actualTableSize, WebTableObject webTableObject) {

        Integer expectedTableSize = actualEntries.size();
        Assert.assertTrue(actualTableSize + 1 == expectedTableSize);
        String lastEntryTable = actualEntries.get(actualTableSize).getText();
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getFirstNameValue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getLastNameValue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getAgeValue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getEmailValue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getSalaryValue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getDepartmentValue()));
    }
}
