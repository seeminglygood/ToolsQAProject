package SharedData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.ITestResult;
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
    public void clearEnvironment(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            LoggerUtility.error(result.getThrowable().getMessage());
            clear();
        } else {
            clear();
            LoggerUtility.endTestCase(testName);
        }
    }

    //adaugam un listener pe statusul testului


    @AfterSuite
    public void finishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }

}
