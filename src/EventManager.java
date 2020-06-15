import java.util.ArrayList;
import java.util.HashMap;

class EventManager {
    private final HashMap<EventType.Type, ArrayList<EventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(EventType.Type eventType, EventListener listener) {
        if (!this.listeners.containsKey(eventType)) {
            this.listeners.put(eventType, new ArrayList<EventListener>());
        }

        this.listeners.get(eventType).add(listener);
    }

    public void unsubscribe(EventType.Type eventType, EventListener listener) {
        this.listeners.get(eventType).remove(listener);

        if (this.listeners.get(eventType).isEmpty()) {
            this.listeners.remove(eventType);
        }
    }

    public void notify(EventType.Type eventType, String fileName) {
        this.listeners.get(eventType).forEach((eventListener) -> {
            eventListener.update(fileName);
        });
    }
}

