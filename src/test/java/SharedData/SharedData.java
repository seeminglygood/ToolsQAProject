package SharedData;
import Logger.LoggerUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
// in aceasta clasa salvezi informatii reusable legate de browser logic
<<<<<<< HEAD
=======
// in aceasta clasa se instantiaza driverul
>>>>>>> LogBranch

public class SharedData {
    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }

    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser was opened, ToolsQA Home page was loaded.");
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,450)", "");
    }
    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser was closed.");
    }
}
