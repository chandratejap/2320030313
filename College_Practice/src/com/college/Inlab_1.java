package com.college;

class Logger {
    // Static variable to hold the single instance
    private static Logger instance;
    
    // Private variable to store logs
    private String log;

    // Private constructor to prevent instantiation
    private Logger() {
        log = "";
    }

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        log += message + "\n";
    }

    // Method to display logs
    public void showLog() {
        System.out.println(log);
    }
}

public class Inlab_1 {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Get the single instance of Logger
        Logger logger = Logger.getInstance();

        System.out.println("Enter log messages (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            logger.log(input);
        }

        System.out.println("\nLogs:");
        logger.showLog();

        scanner.close();
    }

}
