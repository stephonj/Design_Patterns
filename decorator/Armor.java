package decorator;

import java.util.ArrayList;

/**
 * Armor class is a concrete decorator extending PlayerDecorator.
 * It adds armor-related decorations to the player.
 * @author Stephon Johnson
 */
public class Armor extends PlayerDecorator {
    /**
     * Constructor initializes the decorated player with armor decorations.
     * @param player
     */
    public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
    }

    /**
     * Implements the integration of armor decorations into the player's lines.
     */
    @Override
    public void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> playerLines = super.getLines();
        
        for (int i = 0; i < Math.min(playerLines.size(), decor.size()); i++) {
            String playerLine = playerLines.get(i);
            String decorLine = decor.get(i);

            StringBuilder decoratedLine = new StringBuilder();
            int maxLength = Math.max(playerLine.length(), decorLine.length());

            for (int j = 0; j < maxLength; j++) {
                char playerChar = (j < playerLine.length()) ? playerLine.charAt(j) : ' ';
                char decorChar = (j < decorLine.length()) ? decorLine.charAt(j) : ' ';

                // Use the decor character if it's not a space, otherwise, use the player character
                decoratedLine.append((decorChar != ' ') ? decorChar : playerChar);
            }

            // Update the player line with the decorated line
            playerLines.set(i, decoratedLine.toString());
        }

        super.setLines(playerLines);
    }
}

