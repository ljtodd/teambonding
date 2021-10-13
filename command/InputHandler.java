import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence){

    }

    public boolean playCadence(int num){
        if(num < commands.size() - 1){
            /**
             * Sorry Stopped in the middle of this. Cant figure out why were using
             * an array list and not just take the num and check it against if statements
             * but whatever. Ill work on it tomorrow
             */
            return true;
        }
        else{
            return false;
        }
    }
}
