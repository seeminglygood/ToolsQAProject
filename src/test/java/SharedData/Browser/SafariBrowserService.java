package SharedData.Browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariOptions;

import java.util.HashMap;

public class SafariBrowserService extends BaseBrowserService implements BrowserService{

    private WebDriver driver;
    @Override
    public void openBrowser() {
    }
    @Override
    public Object prepareBrowserOptions() {
        HashMap<String, String> browserTestData = getBrowserOptions();
        SafariOptions safariOptions = new SafariOptions();
        safariOptions.setCapability("headless", browserTestData.get("headless"));
        safariOptions.setCapability("gpu", browserTestData.get("gpu"));
        safariOptions.setCapability("infobars", browserTestData.get("infobars"));
        safariOptions.setCapability("sandbox", browserTestData.get("sandbox"));
        safariOptions.setCapability("resolution", browserTestData.get("resolution"));
        return safariOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
