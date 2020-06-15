import java.util.ArrayList;
import java.util.HashMap;

//Event Manager Class
class EventManager {
    private final HashMap<EventType.Type, ArrayList<EventListener>> listeners; //Storing subscribers based on their type

    //Constructor
    public EventManager() {
        this.listeners = new HashMap<>(); //Instansiate a new listeners (HashMap)
    }

    //Subscribes a subscriber
    public void subscribe(EventType.Type eventType, EventListener listener) {

        //Checks if listener has the list of Type event
        if (!this.listeners.containsKey(eventType)) {
            this.listeners.put(eventType, new ArrayList<EventListener>()); //Creates a new list of subscribers of a certain Type event
        }

        this.listeners.get(eventType).add(listener); //Adds the listener (subscriber) to the list of a certain Type event in the HashMap
    }

    //Unsubscribes a subscriber
    public void unsubscribe(EventType.Type eventType, EventListener listener) {
        this.listeners.get(eventType).remove(listener); //Removes the listener (subscriber) from the list of a certain Type event in the HashMap

        //Checks if the list is empty after the removal of the listener (subscriber) inside it
        if (this.listeners.get(eventType).isEmpty()) {
            this.listeners.remove(eventType); //Remove the list of Type event
        }
    }

    //Notifies a certain type of subscribers
    public void notify(EventType.Type eventType, String fileName) {
        this.listeners.get(eventType).forEach((eventListener) -> {
            eventListener.update(fileName); //Send the information through update method
        });
    }
}

