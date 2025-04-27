package creational_patterns.simplefactory;

public class UserAccountFactory {
    public static UserAccount createAccount(String type) {
        return new UserAccount(type);
    }
}
