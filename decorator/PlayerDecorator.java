package decorator;

import java.util.ArrayList;

/**
 * PlayerDecorator is an abstract class representing the base class for all decorators.
 * It extends Player and provides a common structure for decorators.
 * @author Stephon Johnson
 */
public abstract class PlayerDecorator extends Player {
    private Player player;

    public PlayerDecorator(Player player) {
        super(new ArrayList<>(player.getLines()), player.getName());
        this.player = player;
    }

    public abstract void integrateDecor(ArrayList<String> decor);

    /**
     * Get String Lines
     * @return returns the string lines that it got
     */
    @Override
    public ArrayList<String> getLines() {
        return super.getLines();
    }
}
