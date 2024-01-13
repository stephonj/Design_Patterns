package strategy;

// Implementation of DefenceBehavior interface for chasing the puck
public class ChasePuckBehavior implements DefenceBehavior {
    
    // Override method to perform the chasing behavior
    @Override
    public String play() {
        return "Chases the puck"; // Return a string for the action of chasing the puck
    }
}
