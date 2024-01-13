package strategy;

import java.util.Random;

public abstract class Player {
    // Instance variables to store player information and behaviors
    protected String firstName;
    protected String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    // Constructor to initialize player information and behaviors
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
        setDefenceBehavior(); // Set the initial defence behavior
        setOffenceBehavior(); // Set the initial offence behavior
    }

    // Abstract method to be implemented by subclasses to set the defence behavior
    public abstract void setDefenceBehavior();

    // Abstract method to be implemented by subclasses to set the offence behavior
    public abstract void setOffenceBehavior();

    // Method based on possession
    public String play(boolean possession) {
        if (possession) {
            return this.offenceBehavior.play(); // Perform offence behavior if in possession
        } else {
            return this.defenceBehavior.play(); // Perform defence behavior if not in possession
        }
    }

    // Override method to provide a custom string for the player
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
