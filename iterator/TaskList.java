package iterator;
/**
 * Represents a list of tasks in a SCRUM board.
 * @author Stephon Johnson
 */
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Ticket> tickets;
    private String name;

    /**
     * Constructs a task list with the given name.
     *
     * @param name the name of the task list
     */
    public TaskList(String name) {
        this.name = name;
        this.tickets = new ArrayList<>();
    }

    /**
     * Adds a ticket to the task list.
     *
     * @param name       the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        tickets.add(ticket);
    }

    /**
     * Adds a ticket to the task list.
     *
     * @param ticket the ticket to be added
     */
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    /**
     * gets and removes a ticket from the task list by its name.
     *
     * @param name the name of the ticket to retrieve
     * @return the ticket with the specified name, or null if not found
     */
    public Ticket getTicket(String name) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.getName().equals(name)) {
                tickets.remove(i);
                i--; // Decrement i to check the next ticket correctly
                return ticket;
            }
        }
        return null;
    }

    /**
     * Creates an iterator for iterating over the task list.
     *
     * @return a TaskListIterator for iterating over the task list
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets.toArray(new Ticket[0]));
    }

    /**
     * Returns a string representation of the task list.
     *
     * @return a string representation of the task list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (Ticket ticket : tickets) {
            sb.append(ticket.toString()).append("\n");
        }
        return sb.toString();
    }
}
