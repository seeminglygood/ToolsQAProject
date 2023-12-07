package Tests;

import Pages.Elements.ElementsPage;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import SharedData.SharedData;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import SharedData.Hooks;

public class WebTableTest extends Hooks {
    @Test
    public void metodaTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

        String salaryValue = "100000";
        String departmentValue = "IT";
        String ageValue = "38";
        String emailValue = "pikiriki@gmail.com";
        String firstNameValue = "Letitia";
        String lastNameValue = "Carciu";

        WebTablePage webTablePage = new WebTablePage(getDriver());

        webTablePage.addNewEntry(firstNameValue, lastNameValue,emailValue,ageValue,salaryValue,departmentValue);

    }
}
