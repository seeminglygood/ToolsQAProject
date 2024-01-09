package Tests;

import Pages.AlertsFrameWindows.AlertsFrameAndWindowsPage;
import Pages.AlertsFrameWindows.BrowserWindowsPage;
import Pages.HomePage;
import org.testng.annotations.Test;
import SharedData.Hooks;


public class BrowserWindowsTest extends Hooks {
    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(getDriver());
        homePage.alertsFramesWindowsClick();

        AlertsFrameAndWindowsPage alertsFrameAndWindowsPage = new AlertsFrameAndWindowsPage(getDriver());
        alertsFrameAndWindowsPage.browserWindowsClick();

        BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(getDriver());
        // New Tab Test
        browserWindowsPage.interactTab();
        //New window Test
        browserWindowsPage.interactNewWindow();

    }
}
