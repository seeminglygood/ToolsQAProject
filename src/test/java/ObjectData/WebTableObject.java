package ObjectData;

import java.util.HashMap;

public class WebTableObject {

    private String salaryValue;
    private String departmentValue;
    private String ageValue;
    private String emailValue;
    private String firstNameValue;
    private String lastNameValue;

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }
    public WebTableObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    // facem o metoda care sa mapeze valorile din .properties la variabilele din clasa
    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "salaryValue":
                    setSalaryValue(testData.get(Key));
                    break;
                case "departmentValue":
                    setDepartmentValue(testData.get(Key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(Key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(Key));
                    break;
                case "firstNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(Key));
                    break;
            }
        }
    }
}
