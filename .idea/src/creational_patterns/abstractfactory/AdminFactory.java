package creational_patterns.abstractfactory;

public class AdminFactory implements UserReportFactory {
    @Override
    public User createUser() {
        return new AdminUser();
    }

    @Override
    public Report createReport() {
        return new AnonymousReport();
    }
}

