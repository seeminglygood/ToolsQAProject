package SharedData.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;

public class FirefoxBrowserService extends BaseBrowserService implements BrowserService{
        private WebDriver driver;
        @Override
        public void openBrowser() {
        }

        @Override
        public Object prepareBrowserOptions() {
            HashMap<String, String> browserTestData = getBrowserOptions();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(browserTestData.get("headless"));
            firefoxOptions.addArguments(browserTestData.get("gpu"));
            firefoxOptions.addArguments(browserTestData.get("infobars"));
            firefoxOptions.addArguments(browserTestData.get("sandbox"));
            firefoxOptions.addArguments(browserTestData.get("resolution"));
            return firefoxOptions;
        }

        public WebDriver getDriver() {
            return driver;
        }

        public void setDriver(WebDriver driver) {
            this.driver = driver;
        }

}
