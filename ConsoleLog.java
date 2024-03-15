public class ConsoleLog extends Logger {
    public ConsoleLog(LogLevel level) {
        super(level);
    }
    @Override
    protected void writeMessage(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
