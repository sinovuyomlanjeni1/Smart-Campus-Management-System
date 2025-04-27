package creational_patterns.singleton;

public class SystemLogger {
    // Step 1: Create a private static instance
    private static SystemLogger instance;

    // Step 2: Private constructor to prevent instantiation
    private SystemLogger() {}

    // Step 3: Public method to get the instance (lazy-loaded)
    public static SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
