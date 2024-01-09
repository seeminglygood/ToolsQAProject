package Pages.Forms;

import Logger.LoggerUtility;
import ObjectData.FormTableObject;
import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(xpath = "//label[text()='Male']")
    WebElement genderMale;
    @FindBy(xpath = "//label[text()='Female']")
    WebElement genderFemale;
    @FindBy(xpath = "//label[text()='Other']")
    WebElement genderOther;
    @FindBy(id = "userNumber")
    WebElement phone;
    @FindBy(id = "subjectsInput")
    WebElement subjects;
    @FindBy(xpath = "//label[text()='Sports']")
    WebElement hobbySports;
    @FindBy(xpath = "//label[text()='Reading']")
    WebElement hobbyReading;
    @FindBy(xpath = "//label[text()='Music']")
    WebElement hobbyMusic;
    @FindBy(id = "uploadPicture")
    WebElement chooseFile;
    @FindBy(id = "currentAddress")
    WebElement address;
    @FindBy(id = "state")
    WebElement state;
    @FindBy(id = "react-select-3-input")
    WebElement stateInput;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "react-select-4-input")
    WebElement cityInput;
    @FindBy(id = "submit")
    WebElement submit;
    @FindBy(css = ".table-dark>tbody>tr")
    List<WebElement> validationTable;
    @FindBy(id = "closeLargeModal")
    WebElement closeButton;

    public void fillPracticeForm(FormTableObject formTableObject) {
        fillFirstName(formTableObject.getFirstNameValue());
        fillLastName(formTableObject.getLastNameValue());
        fillEmail(formTableObject.getEmailValue());
        selectGender(formTableObject.getGender());
        fillPhoneNumber(formTableObject.getPhoneValue());
        selectSubjects(formTableObject.getSubjectsValue());
        elementsMethods.scrollByPixels(0, 350);
        selectHobby(formTableObject.getHobby());
        ChooseFile(formTableObject.getPathName());
        fillAddress(formTableObject.getAddressValue());
        selectState(formTableObject.getStateInputValue());
        selectCity(formTableObject.getCityInputValue());
    }

    public void fillFirstName(String firstNameValue) {
        elementsMethods.fillElement(firstName, firstNameValue);
        LoggerUtility.info("The user fills the First Name field with value: " + firstNameValue);
    }

    public void fillLastName(String lastNameValue) {
        elementsMethods.fillElement(lastName, lastNameValue);
        LoggerUtility.info("The user fills the Last Name field with value: " + lastNameValue);

    }

    public void fillEmail(String emailValue) {
        elementsMethods.fillElement(email, emailValue);
        LoggerUtility.info("The user fills the Email field with value: " + emailValue);
    }

    public void selectGender(String gender) {
        switch (gender) {
            case "Male":
                elementsMethods.clickElement(genderMale);
                LoggerUtility.info("The user selects the Male radio button");
                break;
            case "Female":
                elementsMethods.clickElement(genderFemale);
                LoggerUtility.info("The user selects the Female radio button");
                break;
            case "Other":
                elementsMethods.clickElement(genderOther);
                LoggerUtility.info("The user selects the Other radio button");
                break;
        }
    }

    public void fillPhoneNumber(String phoneValue) {
        elementsMethods.fillElement(phone, phoneValue);
        LoggerUtility.info("The user fills the Phone Number field with value: " + phoneValue);
    }

    public void selectSubjects(String subjectsValue) {
        elementsMethods.fillElement(subjects, subjectsValue, Keys.ENTER);
        LoggerUtility.info("The user enters " + subjectsValue + " in the Subjects field");
    }

    public void selectHobby(String hobby) {
        switch (hobby) {
            case "Sports":
                elementsMethods.clickElement(hobbySports);
                LoggerUtility.info("The user selects the Sports checkbox");
                break;
            case "Reading":
                elementsMethods.clickElement(hobbyReading);
                LoggerUtility.info("The user selects the Reading checkbox");
                break;
            case "Music":
                elementsMethods.clickElement(hobbyMusic);
                LoggerUtility.info("The user selects the Music checkbox");
                break;
        }
    }

    public void ChooseFile(String pathName) {
        elementsMethods.uploadFile(chooseFile, pathName);
        LoggerUtility.info("The user selects a file to upload with the following path name: " + pathName);
    }

    public void fillAddress(String addressValue) {
        elementsMethods.fillElement(address, addressValue);
        LoggerUtility.info("The user fills the Address field with value: " + addressValue);

    }

    public void selectState(String stateInputValue) {
        elementsMethods.scrollByPixels(0, 450);
        LoggerUtility.info("The user scrolls the page.");
        elementsMethods.fillElement(stateInput, stateInputValue, Keys.ENTER);
        LoggerUtility.info("The user selects the " + stateInputValue + " from the Select State drop down selector and submits; Select City activates");
    }

    public void selectCity(String cityInputValue) {
        elementsMethods.fillElement(cityInput, cityInputValue, Keys.ENTER);
        LoggerUtility.info("The user selects the " + cityInputValue + " from the Select City drop down selector and submits");
    }

    public void clickSubmit() {
        elementsMethods.clickJSElement(submit);
        LoggerUtility.info("The user clicks the Submit button at the bottom right side of the form");
    }

    public void validatePracticeForm(String expectedSummaryText, String firstNameValue, String lastNameValue, String emailValue,
                                     String gender, String phoneValue, String subjectsValue, String hobby, String pathName,
                                     String addressValue, String stateInputValue, String cityInputValue) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dobValue = dtf.format(now);

        WebElement summary = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertTrue(summary.isDisplayed());

        elementsMethods.validateElementMessage(summary, expectedSummaryText);

        File file = new File(pathName);
        String fileName = file.getName();


        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue((validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue)));

        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue((validationTable.get(1).getText().contains(emailValue)));

        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue((validationTable.get(2).getText().contains(gender)));

        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue((validationTable.get(3).getText().contains(phoneValue)));

        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue((validationTable.get(4).getText().contains(dobValue)));

        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue((validationTable.get(5).getText().contains(subjectsValue)));

        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue((validationTable.get(6).getText().contains(hobby)));

        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
        Assert.assertTrue(validationTable.get(7).getText().contains(fileName));

        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
        Assert.assertTrue((validationTable.get(8).getText().contains(addressValue)));

        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue((validationTable.get(9).getText().contains(stateInputValue + " " + cityInputValue)));

    }

    public void closeSummaryModal() {

        elementsMethods.clickJSElement(closeButton);
<<<<<<< HEAD
=======
        LoggerUtility.info("The user clicks the Close button on the Summary page");
        //elementsMethods.clickElement(closeButton);
>>>>>>> LogBranch
    }

}
