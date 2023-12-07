package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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


    public void addNewEntry(String firstNameValue, String lastNameValue, String emailValue, String ageValue, String salaryValue, String departmentValue) {

        Integer actualTableSize = actualEntries.size();
        elementsMethods.clickElement(addButton);
        elementsMethods.fillElement(firstName, firstNameValue);
        elementsMethods.fillElement(lastName, lastNameValue);
        elementsMethods.fillElement(email, emailValue);
        elementsMethods.fillElement(age, ageValue);
        elementsMethods.fillElement(salary, salaryValue);
        elementsMethods.fillElement(department, departmentValue);
        elementsMethods.clickElement(submit);

        validateNewEntry(actualTableSize, firstNameValue, lastNameValue, emailValue, ageValue, salaryValue, departmentValue);
    }

    private void validateNewEntry(Integer actualTableSize, String firstNameValue, String lastNameValue, String emailValue, String ageValue, String salaryValue, String departmentValue) {

        Integer expectedTableSize = actualEntries.size();
        Assert.assertTrue(actualTableSize + 1 == expectedTableSize);
        String lastEntryTable = actualEntries.get(actualTableSize).getText();
        Assert.assertTrue(lastEntryTable.contains(firstNameValue));
        Assert.assertTrue(lastEntryTable.contains(lastNameValue));
        Assert.assertTrue(lastEntryTable.contains(ageValue));
        Assert.assertTrue(lastEntryTable.contains(emailValue));
        Assert.assertTrue(lastEntryTable.contains(salaryValue));
        Assert.assertTrue(lastEntryTable.contains(departmentValue));
    }
//git test 2nd commit
}
