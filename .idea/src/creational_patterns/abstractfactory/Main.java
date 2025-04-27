package creational_patterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        UserReportFactory factory = new AdminFactory();
        User user = factory.createUser();
        Report report = factory.createReport();

        user.displayUserType();
        report.displayReportType();
    }
}

