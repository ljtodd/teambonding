
/**
 * @author Jonathan Brennan, LJ Todd, Tyler Madden, Patrick Burroughs
 * Portia Plante's CSCE 247-002
 * Command Design Pattern (team)
 */

import java.util.ArrayList;

/**
 * Handler for the user's cadence selection and initial executor for the cadence
 */

public class InputHandler {
    private ArrayList<Command> commands;

    /**
     * Constructor for the array list of commands
     * 
     * @param cadence instance of a command
     */
    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    /**
     * Method to play the cadence chosen by the user
     * 
     * @param num user's selection of cadence
     * @return whether the user's input was valid or not
     */
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
