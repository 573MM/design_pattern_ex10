public class FileLog extends Logger {
    public FileLog(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("File::Logger: " + message);
    }
}
