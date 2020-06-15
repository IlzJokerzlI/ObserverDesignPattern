import java.io.File;

public class Editor {
    private final EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        this.eventManager.notify(EventType.Type.OPEN, this.file.getName());
    }

    public void saveFile() {
        this.eventManager.notify(EventType.Type.SAVE, this.file.getName());
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }
}
