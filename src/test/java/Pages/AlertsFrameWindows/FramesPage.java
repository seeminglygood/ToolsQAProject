package Pages.AlertsFrameWindows;

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
        System.out.println(frameText.getText());
      frameMethods.switchToMainFrame();
    }

    public void interactSecondFrame() {
        frameMethods.switchToFrame("frame2");
        System.out.println(frameText.getText());
    }

}
