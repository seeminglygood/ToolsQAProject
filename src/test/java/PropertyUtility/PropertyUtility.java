package PropertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertyUtility {
    public Properties properties;

    public PropertyUtility(String fileName) {
        loadDataFile(fileName);

    }

    // metoda care incarca un fisier de tip ".properties"
    private void loadDataFile(String fileName) {
        properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/testData/"+fileName+"Data.properties");
            properties.load(fileInputStream);
        } catch (IOException ignored) {
        }
    }

    // metoda care returneaza toate datele din fisierul de tip ".properties"
    public HashMap<String, String> getDataFromFile() {
        HashMap<String, String> testData = new HashMap<>();
        for (String Key : properties.stringPropertyNames()) {
            testData.put(Key, properties.getProperty(Key));
        }
        return testData;
    }
}
