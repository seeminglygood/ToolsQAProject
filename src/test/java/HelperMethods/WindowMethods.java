package HelperMethods;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class WindowMethods{
    private WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToSpecificWindow(Integer windowNumber){
        List<String> windows = new ArrayList<>(driver.getWindowHandles()); // lista de windows
        driver.switchTo().window(windows.get(windowNumber));
    }

    public void closeCurrentWindow(){
        driver.close();
    }


}
