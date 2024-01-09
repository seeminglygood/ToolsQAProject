package Pages.Elements;

import Logger.LoggerUtility;
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
        LoggerUtility.info("The current number of entries in the web table  is: " + actualTableSize);
        elementsMethods.clickElement(addButton);
        LoggerUtility.info("The user clicks on the 'Add' button on the left side above the web table");
        elementsMethods.fillElement(firstName, webTableObject.getFirstNameValue());
        LoggerUtility.info("The user enters the first name: " + webTableObject.getFirstNameValue());
        elementsMethods.fillElement(lastName, webTableObject.getLastNameValue());
        LoggerUtility.info("The user enters the last name: " + webTableObject.getLastNameValue());
        elementsMethods.fillElement(email, webTableObject.getEmailValue());
        LoggerUtility.info("The user enters the email address: " + webTableObject.getEmailValue());
        elementsMethods.fillElement(age, webTableObject.getAgeValue());
        LoggerUtility.info("The user inputs their age: " + webTableObject.getAgeValue());
        elementsMethods.fillElement(salary, webTableObject.getSalaryValue());
        LoggerUtility.info("The user enters the salary: " + webTableObject.getSalaryValue());
        elementsMethods.fillElement(department, webTableObject.getDepartmentValue());
        LoggerUtility.info("The user enters the department: " + webTableObject.getDepartmentValue());
        elementsMethods.clickElement(submit);
        LoggerUtility.info("The user clicks the Submit button");

        validateNewEntry(actualTableSize, webTableObject);
    }

    private void validateNewEntry(Integer actualTableSize, WebTableObject webTableObject) {
        Integer expectedTableSize = actualEntries.size();
        Assert.assertTrue(actualTableSize + 1 == expectedTableSize);
        LoggerUtility.info("A new entry has been added to the web table, and the new entries count is: " + expectedTableSize);
        String lastEntryTable = actualEntries.get(actualTableSize).getText();
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getFirstNameValue()));
        LoggerUtility.info("The new web table entry contains the correct first name: " + webTableObject.getFirstNameValue());
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getLastNameValue()));
        LoggerUtility.info("The new web table entry contains the correct last name: " + webTableObject.getLastNameValue());
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getAgeValue()));
        LoggerUtility.info("The new web table entry contains the correct age: " + webTableObject.getAgeValue());
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getEmailValue()));
        LoggerUtility.info("The new web table entry contains the correct email address: " + webTableObject.getEmailValue());
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getSalaryValue()));
        LoggerUtility.info("The new web table entry contains the correct salary: " + webTableObject.getSalaryValue());
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getDepartmentValue()));
        LoggerUtility.info("The new web table entry contains the correct department: " + webTableObject.getDepartmentValue());
    }
}
