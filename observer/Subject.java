package observer;

/**
 * Subject interface for registing removing and notifying observer
 * @author Stephon J
 */
import java.util.ArrayList;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
