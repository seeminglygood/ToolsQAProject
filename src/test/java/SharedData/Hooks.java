package SharedData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends SharedData {

    public HashMap<String, String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnvironment() {
        setup();
        testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getDataFromFile();
        LoggerUtility.startTestCase(testName);
    }

    @AfterMethod
    public void clearEnvironment() {
        clear();
        LoggerUtility.endTestCase(testName);
    }

    @AfterSuite
    public void finishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }

}
