public class ErrorLog extends Logger {
    public ErrorLog(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
