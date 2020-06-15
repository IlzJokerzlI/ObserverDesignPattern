//Logging Listener class implementing EventListener interface
public class EmailAlertsListener implements EventListener {
    private String email; //Email address

    //Constructor
    public EmailAlertsListener(String email) {
        this.email = email; //Assigning the email address
    }

    //Receives information from publisher after an event occured
    @Override
    public void update(String fileName) {
        //Responses or action taken after an event occured in publisher and is notified
        System.out.println("Email to " + this.email + ": \" The file " + fileName + " has been modified!");
    }
}
