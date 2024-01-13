package strategy;

// Implementation of OffenceBehavior interface for slap shot behavior
public class SlapShotBehavior implements OffenceBehavior {

    // Override method to perform the slap shot behavior
    @Override
    public String play() {
        return "shoots the puck from the blue line"; // Return a string for the action of a slap shot
    }
}
