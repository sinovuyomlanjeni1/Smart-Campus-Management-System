package creational_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        SystemLogger logger1 = SystemLogger.getInstance();
        logger1.log("System started.");

        SystemLogger logger2 = SystemLogger.getInstance();
        logger2.log("Logging with the same instance.");

        // Check if both instances are the same
        System.out.println("Same instance? " + (logger1 == logger2));
    }
}