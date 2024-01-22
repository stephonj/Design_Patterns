package observer;

/**
 * a sightings class 
 * @author Stephon Johnson 
 */
import java.util.ArrayList;

public class Sighting {
    private String location, details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Get the location
     * @return returns the location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the details
     * @return Returns details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Get the accomplices
     * @return Returns the accomplices
     */
    public ArrayList<String> getAccomplices() {
        return this.accomplices;
    }
}


