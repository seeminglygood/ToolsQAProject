package Tests;

import ObjectData.TextBoxObject;
import Pages.Elements.ElementsPage;
import Pages.Elements.TextBoxPage;
import Pages.HomePage;
import org.testng.annotations.Test;
import SharedData.Hooks;

    public class TextBoxTest extends Hooks {
        @Test
        public void testMethod() {

            TextBoxObject textBoxObject = new TextBoxObject(testData);

            HomePage homePage = new HomePage(getDriver());
            homePage.clickElements();

            ElementsPage elementsPage = new ElementsPage(getDriver());
            elementsPage.clickTextBox();

            TextBoxPage textBoxPage = new TextBoxPage(getDriver());

            textBoxPage.fillTextBoxForm(textBoxObject);
            textBoxPage.validateTextBoxDataEntry(textBoxObject);

        }
    }

