public class IDontKnowCommand implements Command{
    /**
     * 
     * @param cadence Ties object to new instance of Military Cadence
     */
    public IDontKnowCommand(MilitaryCadence cadence){
        
    }

    /**
     * Runs the singIDontKnow in MilitaryCadence
     */
    public void execute(){
        MilitaryCadence.singIDontKnow();
    }
}
