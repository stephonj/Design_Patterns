package observer;
/**
 * A Police class for Notes and Accomplices
 * @author Stephon J
 */
import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook) {
        this.cook = cook; 
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
        // Registration:
        cook.registerObserver(this);
    }

    /**
     * Updates the location, description, and accomplices and makes sure there isn't repeating names
     */
    @Override
public void update(String location, String description, ArrayList<String> newAccomplices) {
    locations.add(location);
    notes += "\n" + description;

    for (String accompliceString : newAccomplices) {
        String[] newAccompliceArray = accompliceString.split(", ");
        
        for (String accomplice : newAccompliceArray) {
            if (!people.contains(accomplice)) {
                people.add(accomplice);
            }
        }
    }
}

    /**
     * Gets notes and accomplices
     * @return Notes and Accomplices
     */
    @Override
    public String getLog() {
        StringBuilder log = new StringBuilder();
        for (String location : locations) {
            log.append("- ").append(location).append("\n");
        }

        log.append("\nNotes:\n");
    String[] noteArray = notes.split("\n");
    for (String note : noteArray) {
        if (!note.trim().isEmpty()) {
            log.append("- ").append(note.trim()).append("\n");
        }
    }

        log.append("\nAccomplices:\n");
        for (String person : people) {
            log.append("- ").append(person).append("\n");
        }

        return log.toString();
    }
}



    
