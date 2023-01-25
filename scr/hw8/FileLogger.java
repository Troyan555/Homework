package hw8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private final FileLoggerConfiguration configuration;
    private final SimpleDateFormat datetimeFormatter;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        this.datetimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        this.log(LoggingLevel.DEBUG, message);
    }

    public void info(String message) throws IOException, FileMaxSizeReachedException {
        this.log(LoggingLevel.INFO, message);
    }

    private void log(LoggingLevel level, String message) throws IOException, FileMaxSizeReachedException {
        File logFile = new File(configuration.getFilename());
        boolean append;
        if (!logFile.exists()) {
            append = false;
        } else {
            append = true;
            //size check
            long currentSize = logFile.length();
            if (currentSize > configuration.getMaxSize()) {
                throw new FileMaxSizeReachedException(String.format("MaxSize: %d, CurrentSize: %d, File: %s",
                        configuration.getMaxSize(), currentSize, configuration.getFilename()));
            }
        }
        String str;
        // Record format: [CURRENT_HOUR][DEBUG] Alerts: [ALARM-STRING]
        if ("txt".equalsIgnoreCase(configuration.getFileFormat())) {
            str = String.format("[%s][%s] Alerts: [%s]\n", datetimeFormatter.format(new Date()), level.toString(), message);
        } else {
            throw new IOException(configuration.getFileFormat() + " file writing format not supported");
        }
        // add check for max. logging level // configuration.getLoggingLevel // level
        if(level.ordinal()>=configuration.getLoggingLevel().ordinal()) {
            try( FileWriter writer = new FileWriter(logFile, append)) {
                writer.write(str) ;
            }
        }
        else {
            System.err.println(str) ;
        }
    }

}
