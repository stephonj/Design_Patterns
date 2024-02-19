package iterator;
/*
 * Represents a task ticket in a SCRUM board.
 * @author Stephon Johnson
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Constructs a Ticket object with the given name, team member, and difficulty.
     *
     * @param name       the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Gets the name of the ticket.
     *
     * @return the name of the ticket
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the ticket.
     *
     * @return a string representation of the ticket
     */
    @Override
    public String toString() {
        return "- " + name + "(" + difficulty + ") - " + teamMember;
    }
}
