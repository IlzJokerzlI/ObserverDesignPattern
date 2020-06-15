public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();

        //1
        LoggingListener logger1 = new LoggingListener("/pathTo/logOne.txt");
        EmailAlertsListener emailAlerts1 = new EmailAlertsListener("one@example.com");
        editor.getEventManager().subscribe(EventType.Type.OPEN, logger1);
        editor.getEventManager().subscribe(EventType.Type.SAVE, emailAlerts1);


        //2
//        LoggingListener logger2 = new LoggingListener("/pathTo/logTwo.txt");
//        EmailAlertsListener emailAlerts2 = new EmailAlertsListener("two@example.com");
//        editor.getEventManager().subscribe(EventType.Type.OPEN, logger2);
//        editor.getEventManager().subscribe(EventType.Type.SAVE, emailAlerts2);

        try {
            editor.openFile("Application.java");
            editor.saveFile();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
