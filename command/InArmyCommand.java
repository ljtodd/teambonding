public class InArmyCommand implements Command {
    /**
     * 
     * @param cadence Ties object to new instance of Military Cadence
     */
    public InArmyCommand(MilitaryCadence cadence){
        
    }

    /**
     * Runs the singInArmy in MilitaryCadence
     */
    public void execute(){
        MilitaryCadence.singInArmy();
    }
}
