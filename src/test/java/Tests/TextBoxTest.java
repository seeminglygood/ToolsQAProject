package Tests;

import Pages.Elements.ElementsPage;
import Pages.Elements.TextBoxPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;
import SharedData.Hooks;

    public class TextBoxTest extends Hooks {
        @Test
        public void testMethod() {

            HomePage homePage = new HomePage(getDriver());
            homePage.clickElements();

            ElementsPage elementsPage = new ElementsPage(getDriver());
            elementsPage.clickTextBox();

            String username = "miauhampiu";
            String email = "blabla@gmail.com";
            String address = "o tara, un oras, o casa, 555";
            String permaAddress = "alta tara, alt oras, alta casa, 555";

            TextBoxPage textBoxPage = new TextBoxPage(getDriver());
            textBoxPage.fillTextBoxForm(username, email, address, permaAddress);
            textBoxPage.validateTextBox(username, email, address, permaAddress);

        }
    }

