package strategy;

// Goalie class, a specific type of Player
public class Goalie extends Player {

    // Constructor for Goalie class
    public Goalie(String firstName, String lastName) {
        // Call the constructor of the superclass (Player) with first and last names
        super(firstName, lastName);
    }

    // Override method to set the defence behavior for Goalie
    @Override
    public void setDefenceBehavior() {
        // Set the defence behavior to blocking goals
        this.defenceBehavior = new BlockGoalBehavior();
    }

    // Override method to set the offence behavior for Goalie
    @Override
    public void setOffenceBehavior() {
        // Set the offence behavior to blocking goals (same as defence behavior)
        this.offenceBehavior = new BlockGoalBehavior();
    }

    // Override method to provide a custom string representation for Goalie
    @Override
    public String toString() {
        // Call the toString method of the superclass and Goalie information
        return super.toString() + " plays the position: Goalie";
    }
}
