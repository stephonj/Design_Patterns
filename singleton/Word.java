/**
 * The Word class represents a single word with its associated information.
 * @author Stephon Johnson
 */
public class Word {
    private String word; // The word itself
    private String type; // The type or category of the word
    private String definition; // The definition of the word
    private String sentence; // A sentence demonstrating the usage of the word

    /**
     * Constructs a new Word object with the provided attributes.
     * @param word The word itself.
     * @param type The type or category of the word.
     * @param definition The definition of the word.
     * @param sentence A sentence showing the usage of the word.
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word; // Initialize the word
        this.type = type; // Initialize the type
        this.definition = definition; // Initialize the definition
        this.sentence = sentence; // Initialize the sentence
    }

    /**
     * Gets the word.
     * @return The word itself.
     */
    public String getWord() {
        return word; // Return the word
    }

    /**
     * Gets a description of the word, including its type, definition, and usage in a sentence.
     * @return A string representation of the words description.
     */
    public String getDescription() {
        return "Word: " + word + ", Type: " + type + ", Definition: " + definition + ", Sentence: " + sentence;
    }
}

