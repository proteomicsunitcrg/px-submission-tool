package uk.ac.ebi.pride.gui.data;

public class Credentials {

    private String username;

    private String password;

    public Credentials() {
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{\"Credentials\":{" +
                "\"username\":\"" + username + '\"' +
                ", \"password\":\"" + password + "\"" +
                "}}";
    }
}
