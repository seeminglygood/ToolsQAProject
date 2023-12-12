package Tests;

import ObjectData.AlertObject;
import Pages.AlertsFrameWindows.AlertsPage;
import Pages.AlertsFrameWindows.AlertsFrameAndWindowsPage;
import Pages.HomePage;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import SharedData.Hooks;

public class AlertsTest extends Hooks {
    @Test
    public void testMethod() {

        AlertObject alertObject = new AlertObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.alertsFramesWindowsClick();


        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        AlertsFrameAndWindowsPage alertsFrameAndWindowsPage = new AlertsFrameAndWindowsPage(getDriver());
        alertsFrameAndWindowsPage.alertsClick();

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.interactAlertOK();
        alertsPage.interactTimerAlert();
        alertsPage.interactConfirmAlert();
        alertsPage.interactPromptAlert(alertObject);

    }

}
