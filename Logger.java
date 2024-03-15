public abstract class Logger {
    protected LogLevel level;
    protected Logger next;
    protected abstract void writeMessage(String message);
    public Logger(LogLevel level) {
        this.level = level;
    }
    public void setLogger(Logger logger) {
        if(next != null) {
            next.setLogger(logger);
        }
        else {
            next = logger;
        }
    }
    public void logMessage(LogLevel level, String message) {
        if (this.level.getLevel() <= level.getLevel()) {
            writeMessage(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }
}
