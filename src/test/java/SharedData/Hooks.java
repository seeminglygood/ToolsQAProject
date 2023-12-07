package SharedData;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends SharedData{

    public HashMap<String, String> testData;

    @BeforeMethod
public void prepareEnvironment(){
        setup();
        String testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getDataFromFile();

    }

    @AfterMethod
    public void clearEnvironment(){
        clear();
    }
}
