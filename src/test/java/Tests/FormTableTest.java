package Tests;

import ObjectData.FormTableObject;
import Pages.Forms.FormsPage;
import Pages.HomePage.HomePage;
import Pages.Forms.PracticeFormPage;
import org.testng.annotations.Test;
import SharedData.Hooks;

public class FormTableTest extends Hooks {
    @Test
    public void testMethod() {

        FormTableObject formTableObject = new FormTableObject(testData);

        //from the https://demoqa.com/ Home Page, click on the Forms entry => /forms page opens
        HomePage homePage = new HomePage(getDriver());
        homePage.formsClick();

        // from /forms page, click Practice Form in the right side menu => /automation-practice-form page opens
        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.practiceFormClick();

//        // define all the variables needed to fill the form
//        String firstNameValue = "Letitia";
//        String lastNameValue = "Carciu";
//        String emailValue = "blabla@gmail.com";
//        String gender = "Male"; // Possible: "Male" , "Female" , "Other"
//        String phoneValue = "0123456789";
//        String subjectsValue = "English"; // Possible: "English" , "Chemistry" , "Computer Science" , "Commerce" , "Economics" , "Social Studies"
//        String hobby = "Reading"; // Possible: "Reading" , "Sports" , "Music"
//        String pathName = "src/test/resources/Screenshot 2023-11-01 at 15.10.52.png";
//        String addressValue = "O tara, un oras, un cod postal 555";
//        String stateInputValue = "NCR"; // Possible: "NCR" , "Uttar Pradesh" , "Haryana" , "Rajastan"
//        String cityInputValue = "Delhi"; // Possible: for "NCR" : "Delhi" , "Gugaron", "Noida"
//                                                    //for  "Uttar Pradesh" :  "Agra" , "Lucknow" , "Merrut"
//                                                    // for "Haryana" : "Karnal" , "Panipat"
//                                                    // for "Rajastan" : "Jaipur" , "Jaiselmer"
//        String expectedSummaryText = "Thanks for submitting the form";

        // trigger full form filling on the /automation-practice-form page
        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        //practiceFormPage.fillPracticeForm(firstNameValue, lastNameValue, emailValue, gender, phoneValue, subjectsValue, hobby, pathName, addressValue, stateInputValue, cityInputValue);
        practiceFormPage.fillPracticeForm(formTableObject);
        // submit the fully filled form
        practiceFormPage.clickSubmit();

        // validate the form data entered versus the data displayed on the form summary modal
//        practiceFormPage.validatePracticeForm(expectedSummaryText, firstNameValue, lastNameValue, emailValue, gender, phoneValue, subjectsValue, hobby, pathName, addressValue, stateInputValue, cityInputValue);

        // close the form summary modal
        practiceFormPage.closeSummaryModal();
    }

}
