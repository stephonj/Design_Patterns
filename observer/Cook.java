package observer;

/**
 * Cook class 
 * @author Stephon J
 */
import java.util.ArrayList;

public class Cook implements Subject {
    private String name;
    private ArrayList<Observer> observers;

    /**
     * Creates Cook Name
     * @param name The name of the cook
     */
    public Cook(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String... accomplices) {
        ArrayList<String> accompliceList = new ArrayList<>();
        for (String accomplice : accomplices) {
            accompliceList.add(accomplice);
        }
        notifyObservers(location, description, accompliceList);
    }

    /**
     * Get name
     * @return Returns name
     */
    public String getName() {
        return this.name;
    }
}
