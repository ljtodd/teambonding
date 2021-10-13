public class EverywhereCommand implements Command {
    /**
     * 
     * @param cadence Ties object to new instance of Military Cadence
     */
    public EverywhereCommand(MilitaryCadence cadence){
        
    }

    /**
     * Runs the singEverywhereIGo in MilitaryCadence
     */
    public void execute(){
        MilitaryCadence.singEverywhereIGo();
    }
}
