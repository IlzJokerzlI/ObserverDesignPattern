import java.io.File;

public class LoggingListener implements EventListener {
    private File log;

    public LoggingListener(String logFileName) {
        this.log = new File(logFileName);
    }

    @Override
    public void update(String fileName) {
        System.out.println("Saved to " + this.log.getName() + " : The file " + fileName + " has been opened!");
    }
}
