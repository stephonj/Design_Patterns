package strategy;

import java.util.Random;

public class Defenceman extends Player {

    // Constructor for Defenceman class
    public Defenceman(String firstName, String lastName) {
        // Call the constructor of the superclass (Player) with first and last names
        super(firstName, lastName);
    }

    // Override method to set the defence behavior for Defenceman
    @Override
    public void setDefenceBehavior() {
        // Create a random number generator
        Random rand = new Random();
        // Generate a random number (0 or 1)
        int randomNo = rand.nextInt(2);
        // Set the defence behavior based on the random number
        if (randomNo == 0) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

    // Override method to set the offence behavior for Defenceman
    @Override
    public void setOffenceBehavior() {
        // Create a random number generator
        Random rand = new Random();
        // Generate a random number (0 or 1)
        int randomNo = rand.nextInt(2);
        // Set the offence behavior based on the random number
        if (randomNo == 1) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new SlapShotBehavior();
        }
    }

    // Override method to provide a custom string for Defenceman
    @Override
    public String toString() {
        // Call the toString method of the superclass and Defenceman information
        return super.toString() + " plays the position: Defenceman";
    }
}
