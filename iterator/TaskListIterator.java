package iterator;
/*
 * Represents an iterator for iterating over a list of tickets.
 * @author Stephon Johnson
 */
import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;

    /**
     * Constructs a TaskListIterator with the given array of tickets.
     *
     * @param tickets the array of tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Checks if there are more tickets to iterate over.
     *
     * @return true if there are more tickets, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < tickets.length;
    }

    /**
     * Retrieves the next ticket in the iteration.
     *
     * @return the next ticket
     */
    @Override
    public Ticket next() {
        if (hasNext()) {
            return tickets[position++];
        }
        return null;
    }
}


