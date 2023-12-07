package Tests;

import Pages.AlertsFrameWindows.AlertsPage;
import Pages.AlertsFrameWindows.AlertsFrameAndWindowsPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class AlertsTest extends SharedData {
    @Test
    public void testMethod() {

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
        alertsPage.interactPromptAlert();

    }

}