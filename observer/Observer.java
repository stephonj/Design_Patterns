package observer;

/**
 * Observer interface for updating and getting log
 * @author Stephon J
 */
import java.util.ArrayList;

public interface Observer {
    void update(String location, String description, ArrayList<String> accomplices);
    String getLog();
}
