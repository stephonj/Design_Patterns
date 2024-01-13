package strategy;

import java.util.Random;

// Implementation of DefenceBehavior interface for blocking behavior
public class BlockBehavior implements DefenceBehavior {

    // Override method to perform the blocking behavior
    @Override
    public String play() {
        // Create a random number generator
        Random rand = new Random();
        // Generate a random number (0 to 2)
        int option = rand.nextInt(3);

        // Check the value of the random number and return the corresponding action
        if (option == 0) {
            return "blocks player from passing";
        } else if (option == 1) {
            return "blocks player from shooting";
        } else {
            return "checks player with puck";
        }
    }
}
