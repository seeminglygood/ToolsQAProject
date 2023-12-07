package SharedData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class SharedData {
    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
public void scrollPage(Integer x, Integer y){
    JavascriptExecutor JS = (JavascriptExecutor) getDriver();
    JS.executeScript("window.scrollBy(x,y)", "");
}

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,450)", "");
    }
    @AfterMethod
    public void clear(){
        driver.quit();
    }


}
