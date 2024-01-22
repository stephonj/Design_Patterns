package observer;

/**
 * Class for the cartel
 * @author Stephon J
 */
import java.util.ArrayList;

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        this.cook = cook;
        this.sightings = new ArrayList<>();
        // Registration:
        cook.registerObserver(this);
    }

    /**
     * Updates location description and accomplice in cartel class
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        sightings.add(new Sighting(location, description, accomplices));
    }

    /**
     * Gets log and correctly formats the sightings
     * @return Returns the cartel sightings
     */
    public String getLog() {
        StringBuilder str = new StringBuilder();
        for (Sighting sighting : sightings) {
            str.append(sighting.getLocation()).append(" (").append(sighting.getDetails()).append("), with ");
            if (!sighting.getAccomplices().isEmpty()) {
                for (String accomplice : sighting.getAccomplices()) {
                    str.append(accomplice).append(", ");
                }
                // Remove the trailing comma and space
                str.delete(str.length() - 2, str.length());
            }
            str.append("\n");
        }
        return str.toString();
    }
    
    
    
}


