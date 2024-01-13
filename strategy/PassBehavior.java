package strategy;

// Implementation of OffenceBehavior interface for passing behavior
public class PassBehavior implements OffenceBehavior {

    // Override method to perform the passing behavior
    @Override
    public String play() {
        return "passes to a forward"; // Return a string for the action of passing
    }
}

