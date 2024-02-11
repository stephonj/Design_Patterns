/**
 * The FlashCards class represents a collection of flashcards for vocabulary.
 * @author Stephon Johnson
 */
import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private static FlashCards flashCards; // Singleton instance of FlashCards
    private Random rand; // Random number generator
    private ArrayList<Word> words; // List of words for the flashcards
    private Word currentWord; // The current word being studied

    /**
     * Private constructor to initialize FlashCards instance.
     */
    private FlashCards() {
        rand = new Random(); // Initialize the random number generator
        words = FileReader.getWords(); // gets words from file
        if (!words.isEmpty()) // If there are words available
            currentWord = words.get(rand.nextInt(words.size())); // Select a random word
    }

    /**
     * Gets the singleton instance of FlashCards.
     * @return The singleton instance of FlashCards.
     */
    public static FlashCards getInstance() {
        if (flashCards == null)
            flashCards = new FlashCards();
        return flashCards;
    }
    

    /**
     * Gets the current word being studied.
     * @return The current word being studied.
     */
    public Word getWord() {
        return currentWord; // Return the current word
    }
}
