package HelpMethods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {
    private WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrame(String frameNameorID){
        driver.switchTo().frame(frameNameorID);
    }

    public void switchToMainFrame(){
        driver.switchTo().defaultContent();
    }


}
