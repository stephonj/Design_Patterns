package state;

/**
 * A concrete class representing the Third Grade state in the SpellingList
 * This state loads words for the third grade and defines behavior for the grade
 * @author Stephon Johnson
 */
public class ThirdGradeState extends State {

    /**
     * Constructs a ThirdGradeState object with the given SpellingList.
     *
     * @param spellingList The SpellingList to associate with the state.
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        // Load words for third grade
        words = FileReader.getWords("state/txt/third.txt");
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
        System.out.println("Already at the highest grade (Third Grade).");
    }

    @Override
    public void decreaseGrade() {
        // Implementation for decreasing the grade state from third to second grade
        spellingList.setState(new SecondGradeState(spellingList));
    }
}

