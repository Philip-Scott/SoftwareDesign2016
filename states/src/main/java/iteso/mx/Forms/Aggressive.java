package iteso.mx.Forms;

/**
 * Created by felipe on 11/17/16.
 */
public class Aggressive implements State {
    public String run_ai () {
        return "is Aggressive";
    }

    public State next_state () {
        return new TakingOverTheWorld();
    }
}
