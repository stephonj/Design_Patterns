package decorator;

import java.util.ArrayList;

/**
 * The Player class represents a player in a game 
 * and holds information about the player's name and lines of text.
 * @author Stephon Johnson
 */
public class Player {

    private String name;
    
    
    private ArrayList<String> lines;

    /**
     * Constructor for Player class
     * @param lines List of string lines
     * @param name Player name
     */
    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * Gets the player name
     * @return Returns player name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the string lines
     * @return Returns the lines
     */
    protected ArrayList<String> getLines() {
        return lines;
    }

    /**
     * Sets the string lines
     * @param lines List of string lines to set
     */
    protected void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Creates String Representation for Player
     * @return Returns the string after it loops through the lines
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Player: ").append(name).append("\n");
        
        // Appending each line in the list to the result
        for (String line : lines) {
            result.append(line).append("\n");
        }
        
        return result.toString();
    }
}
