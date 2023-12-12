package ObjectData;

import java.util.HashMap;

public class TextBoxObject {
   private String username;
    private String email;
    private String address;
    private String permaAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermaAddress() {
        return permaAddress;
    }

    public void setPermaAddress(String permaAddress) {
        this.permaAddress = permaAddress;
    }

    public TextBoxObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    // facem o metoda care sa mapeze valorile din .properties la variabilele din clasa
    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "username":
                    setUsername(testData.get(Key));
                    break;
                case "email":
                    setEmail(testData.get(Key));
                    break;
                case "address":
                    setAddress(testData.get(Key));
                    break;
                case "permaAddress":
                    setPermaAddress(testData.get(Key));
                    break;
            }
        }
    }
}
