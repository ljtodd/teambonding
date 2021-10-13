public class IDontKnowCommand implements Command{
    public IDontKnowCommand(MilitaryCadence cadence){
        
    }

    public void execute(){
        MilitaryCadence.singIDontKnow();
    }
}
