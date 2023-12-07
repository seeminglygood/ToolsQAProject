package Tests;

import Pages.AlertsFrameWindows.AlertsFrameAndWindowsPage;
import Pages.AlertsFrameWindows.WindowsPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;


public class WindowsTest extends SharedData {
    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(getDriver());
        homePage.alertsFramesWindowsClick();

        AlertsFrameAndWindowsPage alertsFrameAndWindowsPage = new AlertsFrameAndWindowsPage(getDriver());
        alertsFrameAndWindowsPage.browserWindowsClick();

        // define variables for tests
        String initialURL = getDriver().getCurrentUrl();
        String expectedURL = "https://demoqa.com/sample";

        WindowsPage browserWindowsPage = new WindowsPage(getDriver());
        // New Tab Test
        browserWindowsPage.interactTab(initialURL, expectedURL);
        //New window Test
        browserWindowsPage.interactNewWindow(initialURL, expectedURL);

    }
}
