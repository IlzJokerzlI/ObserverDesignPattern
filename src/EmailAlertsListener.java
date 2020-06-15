public class EmailAlertsListener implements EventListener {
    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String fileName) {
        System.out.println("Email to " + this.email + ": \" The file " + fileName + " has been modified!");
    }
}
