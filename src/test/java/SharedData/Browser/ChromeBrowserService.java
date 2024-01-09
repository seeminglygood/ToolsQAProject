package SharedData.Browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;

public class ChromeBrowserService extends BaseBrowserService implements BrowserService{

    private WebDriver driver;
    @Override
    public void openBrowser() {
    }

    @Override
    public Object prepareBrowserOptions() {
        HashMap<String, String> browserTestData = getBrowserOptions();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(browserTestData.get("headless"));
        chromeOptions.addArguments(browserTestData.get("gpu"));
        chromeOptions.addArguments(browserTestData.get("infobars"));
        chromeOptions.addArguments(browserTestData.get("sandbox"));
        chromeOptions.addArguments(browserTestData.get("resolution"));
        return chromeOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
