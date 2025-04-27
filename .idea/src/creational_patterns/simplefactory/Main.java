package creational_patterns.simplefactory;

public class Main {
    public static void main(String[] args) {
        UserAccount admin = UserAccountFactory.createAccount("Admin");
        System.out.println(admin.getRole());
    }
}
