/**
 * @author Jonathan Brennan, LJ Todd, Tyler Madden, Patrick Burroughs Portia
 *         Plante's CSCE 247-002 Command Design Pattern (team)
 */

public class InArmyCommand implements Command {
    /**
     * 
     * @param cadence Ties object to new instance of Military Cadence
     */
    public InArmyCommand(MilitaryCadence cadence) {

    }

    /**
     * Runs the singInArmy in MilitaryCadence
     */
    public void execute() {
        MilitaryCadence.singInArmy();
    }
}
