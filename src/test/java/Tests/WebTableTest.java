package Tests;

import ObjectData.WebTableObject;
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
        WebTableObject webTableObject = new WebTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();



        WebTablePage webTablePage = new WebTablePage(getDriver());

        webTablePage.addNewEntry(webTableObject);

    }
}
