package hw8;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("FileLogger demo");

        FileLoggerConfiguration configuration = new FileLoggerConfiguration();
        configuration.setFilename("logs.txt");
        configuration.setFileFormat("TXT");
       // configuration.setLoggingLevel(LoggingLevel.INFO);
        configuration.setLoggingLevel(LoggingLevel.DEBUG);
        configuration.setMaxSize(1024);

        FileLogger logger = new FileLogger(configuration);

        try {
            logger.debug("Debug message");
            logger.info("Info message");
        } catch (FileMaxSizeReachedException ex) {
            System.out.println("FileMaxSizeReachedException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }

        System.out.println("Done");
    }
}


