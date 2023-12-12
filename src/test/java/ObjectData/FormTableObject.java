package ObjectData;

import java.util.HashMap;

public class FormTableObject {
    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String gender;
    private String phoneValue;
    private String subjectsValue;
    private String hobby;
    private String pathName;
    private String addressValue;
    private String stateInputValue;
    private String cityInputValue;
    private String expectedSummaryText;


    public FormTableObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    // facem o metoda care sa mapeze valorile din .properties la variabilele din clasa
    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(Key));
                    break;

                case "emailValue":
                    setEmailValue(testData.get(Key));
                    break;

                case "gender":
                    setGender(testData.get(Key));
                    break;

                case "phoneValue":
                    setPhoneValue(testData.get(Key));
                    break;

                case "subjectsValue":
                    setSubjectsValue(testData.get(Key));
                    break;

                case "hobby":
                    setHobby(testData.get(Key));
                    break;

                case "pathName":
                    setPathName(testData.get(Key));
                    break;

                case "addressValue":
                    setAddressValue(testData.get(Key));
                    break;

                case "stateInputValue":
                    setStateInputValue(testData.get(Key));
                    break;

                case "cityInputValue":
                    setCityInputValue(testData.get(Key));
                    break;

                case "expectedSummaryText":
                    setExpectedSummaryText(testData.get(Key));
                    break;
            }

        }
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

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getSubjectsValue() {
        return subjectsValue;
    }

    public void setSubjectsValue(String subjectsValue) {
        this.subjectsValue = subjectsValue;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getStateInputValue() {
        return stateInputValue;
    }

    public void setStateInputValue(String stateInputValue) {
        this.stateInputValue = stateInputValue;
    }

    public String getCityInputValue() {
        return cityInputValue;
    }

    public void setCityInputValue(String cityInputValue) {
        this.cityInputValue = cityInputValue;
    }

    public String getExpectedSummaryText() {
        return expectedSummaryText;
    }

    public void setExpectedSummaryText(String expectedSummaryText) {
        this.expectedSummaryText = expectedSummaryText;
    }
}