package creational_patterns.simplefactory;

public class UserAccount {
    private String role;

    public UserAccount(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
