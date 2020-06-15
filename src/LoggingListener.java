import java.io.File;

//Logging Listener class implementing EventListener interface
public class LoggingListener implements EventListener {
    private File log; //Log file

    //Constructor
    public LoggingListener(String logFileName) {
        this.log = new File(logFileName); //Instansiate a new log file
    }

    //Receives information from publisher after an event occured
    @Override
    public void update(String fileName) {
        //Responses or action taken after an event occured in publisher and is notified
        System.out.println("Saved to " + this.log.getName() + " : The file " + fileName + " has been opened!");
    }
}
