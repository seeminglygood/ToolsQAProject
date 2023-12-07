package Tests;

import Pages.AlertsFrameWindows.AlertsFrameAndWindowsPage;
import Pages.AlertsFrameWindows.FramesPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FramesTest extends SharedData {
    @Test
    public void testMethod(){
        HomePage homePage = new HomePage(getDriver());
        homePage.alertsFramesWindowsClick();

        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        AlertsFrameAndWindowsPage alertsFrameAndWindowsPage= new AlertsFrameAndWindowsPage(getDriver());
        alertsFrameAndWindowsPage.framesClick();

       FramesPage framesPage = new FramesPage(getDriver());
        framesPage.interactFirstFrame();
        framesPage.interactSecondFrame();
    }

}
