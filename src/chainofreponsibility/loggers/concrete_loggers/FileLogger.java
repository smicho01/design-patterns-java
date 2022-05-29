package chainofreponsibility.loggers.concrete_loggers;

import chainofreponsibility.loggers.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
