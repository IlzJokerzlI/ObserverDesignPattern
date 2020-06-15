import java.io.File;

//Editor Class
public class Editor {
    private final EventManager eventManager; //Event Manager
    private File file; //The current opened file

    //Constructor
    public Editor() {
        this.eventManager = new EventManager(); //Instansiate a new Event Manager
    }

    //Opens file
    public void openFile(String path) {
        this.file = new File(path); //Instansiate a new "opened" file from the given path
        this.eventManager.notify(EventType.Type.OPEN, this.file.getName()); //notify subscirbers with Type Open
    }

    //Saves file
    public void saveFile() {
        this.eventManager.notify(EventType.Type.SAVE, this.file.getName()); //notify subscribers with Type Save
    }

    //Event Manager getter
    public EventManager getEventManager() {
        return this.eventManager;
    }
}
