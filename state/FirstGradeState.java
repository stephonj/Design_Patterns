package state;

/**
 * A concrete class representing the First Grade state in the SpellingList
 * This state loads words for the first grade and defines behavior for the grade
 * @author Stephon Johnson
 */
public class FirstGradeState extends State {

    /**
     * Constructs a FirstGradeState object with the given SpellingList
     *
     * @param spellingList The SpellingList to associate with the state
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        // Load words for first grade
        words = FileReader.getWords("state/txt/first.txt");
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
        // Implementation for increasing the grade state from first to second grade
        spellingList.setState(new SecondGradeState(spellingList));
    }

    @Override
    public void decreaseGrade() {
        // Implementation for decreasing the grade state from first to the lowest grade
        System.out.println("Already at the lowest grade (First Grade).");
    }
}

