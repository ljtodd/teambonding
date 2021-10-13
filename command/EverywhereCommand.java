/**
 * @author Jonathan Brennan, LJ Todd, Tyler Madden, Patrick Burroughs Portia
 *         Plante's CSCE 247-002 Command Design Pattern (team)
 */

public class EverywhereCommand implements Command {
    /**
     * 
     * @param cadence Ties object to new instance of Military Cadence
     */
    public EverywhereCommand(MilitaryCadence cadence) {

    }

    /**
     * Runs the singEverywhereIGo in MilitaryCadence
     */
    public void execute() {
        MilitaryCadence.singEverywhereIGo();
    }
}
