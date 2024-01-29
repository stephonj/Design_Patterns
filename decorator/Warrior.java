package decorator;

import java.util.ArrayList;

/**
 * Warrior class is a specific type of player that extends the Player class. 
 * It represents a warrior character in a game and is initialized with predefined lines from a file.
 * @author Stephon Johnson
 */
public class Warrior extends Player {

    private static final String WARRIOR_FILE = "decorator/txt/warrior.txt";

    /**
     * Constructor for the Warrior class
     * @param name Name of the warrior player
     */
    public Warrior(String name) {
        // Calls the constructor of the superclass (Player) with lines read from the warrior file and the given name
        super(FileReader.getLines(WARRIOR_FILE), name);
    }
}
