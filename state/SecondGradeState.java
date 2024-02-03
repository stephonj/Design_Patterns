package state;

/**
 * A concrete class representing the Second Grade state in the SpellingList
 * This state loads words for the second grade and defines behavior for the grade
 * @author Stephon Johnson
 */
public class SecondGradeState extends State {

    /**
     * Constructs a SecondGradeState object with the given SpellingList.
     *
     * @param spellingList The SpellingList to associate with the state.
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        // Load words for second grade
        words = FileReader.getWords("state/txt/second.txt");
    }

    @Override
    public String getNextWord() {
        if (words.isEmpty()) {
            return "No words available in this grade.";
        }

        int index = rand.nextInt(words.size());
        return words.get(index);
    }


    @Override
    public void increaseGrade() {
        // Implementation for increasing the grade state from second to third grade
        spellingList.setState(new ThirdGradeState(spellingList));
    }

    @Override
    public void decreaseGrade() {
        // Implementation for decreasing the grade state from second to first grade
        spellingList.setState(new FirstGradeState(spellingList));
    }
}

