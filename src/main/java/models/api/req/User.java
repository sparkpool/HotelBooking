package models.api.req;

public class User {

    private String name;
    private String email;
    private String phoneCountryCode;
    private String phoneNo;

    public User(String name, String email, String phoneCountryCode, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneCountryCode = phoneCountryCode;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

