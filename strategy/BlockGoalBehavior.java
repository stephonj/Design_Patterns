package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

    // Override method to determine the action when playing
    @Override
    public String play() {
        // Create a random number generator
        Random rand = new Random();
        // Generate a random number (0 to 3)
        int option = rand.nextInt(4);

        // Check the value of the random number and return the corresponding action
        if (option == 0) {
            return "hand blocks the puck";
        } else if (option == 1) {
            return "catches the puck";
        } else if (option == 2) {
            return "blocks puck with knee pads";
        } else {
            return "blocks puck with stick";
        }
    }
}
