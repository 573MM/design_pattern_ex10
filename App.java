public class App {
    public static void main(String[] args) {
        Logger ee = new ErrorLog(LogLevel.ERROR);
        Logger ff = new FileLog(LogLevel.DEBUG);
        Logger cc = new ConsoleLog(LogLevel.INFO);

        ee.setLogger(cc);
        cc.setLogger(ff);

        ee.logMessage(LogLevel.ERROR, "This is an error information.");
        ee.logMessage(LogLevel.INFO, "This is an information.");
        ee.logMessage(LogLevel.DEBUG, "This is a debug information.");
        
    }
}
