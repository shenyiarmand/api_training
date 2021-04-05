package fr.esiea.ex4A.data;

public class User {

    private final String userEmail;
    private final String userName;
    private final String userTwitter;
    private final String userCountry;
    private final String userSex;
    private final String userSexPref;

    public User(String userEmail, String userName, String userTwitter, String userCountry, String userSex, String userSexPref) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTwitter = userTwitter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserTwiter() {
        return userTwitter;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserSexPref() {
        return userSexPref;
    }
}