package strategy;

// Implementation of OffenceBehavior interface for shooting behavior
public class ShootBehavior implements OffenceBehavior {

    // Override method to perform the shooting behavior
    @Override
    public String play() {
        return "shoots at the goal"; // Return a string for the action of shooting
    }
}
