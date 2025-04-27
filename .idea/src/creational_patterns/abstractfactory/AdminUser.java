package creational_patterns.abstractfactory;

public class AdminUser implements User {
    @Override
    public void displayUserType() {
        System.out.println("Admin User");
    }
}

