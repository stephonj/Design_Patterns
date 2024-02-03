package state;

import java.util.ArrayList;

/**
 * A class representing a Spelling List in the SpellingList application.
 * This class manages the current state of the spelling list and provides methods for its changes
 * @author Stephon Johnson
 */
public class SpellingList {

    /** The current state of the spelling list. */
    private State state;

    /** The state representing the first grade. */
    private State firstGradeState;

    /** The state representing the second grade. */
    private State secondGradeState;

    /** The state representing the third grade. */
    private State thirdGradeState;

    /**
     * Constructs a SpellingList object with initial grade states.
     * The initial state is set to the first grade.
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);

        // Initial state is set to first grade
        state = firstGradeState;
    }

    /**
     * Gets the next word from the current state of the spelling list.
     *
     * @return The next word from the spelling list.
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increases the grade state of the spelling list.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decreases the grade state of the spelling list.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Gets the state representing the first grade.
     *
     * @return The state representing the first grade.
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Gets the state representing the second grade
     *
     * @return The state representing the second grade
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Gets the state representing the third grade
     *
     * @return The state representing the third grade
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Sets the current state of the spelling list
     *
     * @param state The new state for the spelling list
     */
    public void setState(State state) {
        this.state = state;
    }
}


