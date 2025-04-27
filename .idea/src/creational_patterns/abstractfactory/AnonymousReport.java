package creational_patterns.abstractfactory;

public class AnonymousReport implements Report {
    @Override
    public void displayReportType() {
        System.out.println("Anonymous Report");
    }
}
