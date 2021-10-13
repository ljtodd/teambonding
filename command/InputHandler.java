
/**
 * @author Jonathan Brennan, LJ Todd, Tyler Madden, Patrick Burroughs
 * Portia Plante's CSCE 247-002
 * Command Design Pattern (team)
 */

import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    public boolean playCadence(int num) {
        if (num >= 0 && num < commands.size()) {
            commands.get(num).execute();
            return true;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }
}
