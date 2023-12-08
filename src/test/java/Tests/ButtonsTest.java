package Tests;

import HelperMethods.ElementsMethods;
import Pages.Elements.ButtonsPage;
import Pages.Elements.ElementsPage;
import Pages.HomePage.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class ButtonsTest extends Hooks {
    @Test
    public void testMethod() {

       HomePage homePage = new HomePage(getDriver());
       homePage.elementsClick();

        ElementsMethods elementsMethods = new ElementsMethods(getDriver());
        elementsMethods.scrollByPixels(0, 450);

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickButtons();

        ButtonsPage buttonsPage = new ButtonsPage(getDriver());
        buttonsPage.clickAllButtons();
    }
}
