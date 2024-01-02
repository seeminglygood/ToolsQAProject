package Pages.AlertsFrameWindows;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sampleHeading")
    WebElement frameText;

    public void interactFirstFrame() {
      frameMethods.switchToFrame("frame1");
        LoggerUtility.info("The user clicks on the 1st frame; focus is switched to the frame; text inside the frame is: " + frameText.getText());
      frameMethods.switchToMainFrame();
        LoggerUtility.info("The user clicks outside the 1st frame; focus switched to the main page.");
    }

    public void interactSecondFrame() {
        frameMethods.switchToFrame("frame2");
        LoggerUtility.info("The user clicks on the 2nd frame; focus is switched to the frame; text inside the frame is: " + frameText.getText());
        frameMethods.switchToMainFrame();
        LoggerUtility.info("The user clicks outside the 2nd frame; focus switched to the main page.");
    }

}
