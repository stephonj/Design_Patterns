package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * An abstract class representing a state in the SpellingList.
 * This class defines common behavior for different grade states.
 * @author Stephon Johnson
 */
public abstract class State {

    /** The spelling list associated with the state. */
    protected SpellingList spellingList;

    /** The list of words for the current grade state. */
    protected ArrayList<String> words;

    /** A random number generator for selecting words. */
    protected Random rand;

    /**
     * Constructs a State object with the given SpellingList.
     *
     * @param spellingList The SpellingList to associate with the state.
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }

    /**
     * Abstract method to get the next word in the current grade state.
     *
     * @return The next word in the grade state.
     */
    public abstract String getNextWord();

    /**
     * Abstract method to increase the grade state.
     */
    public abstract void increaseGrade();

    /**
     * Abstract method to decrease the grade state.
     */
    public abstract void decreaseGrade();
}
