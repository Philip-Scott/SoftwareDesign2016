package iteso.mx.Forms;

/**
 * Created by felipe on 11/17/16.
 */
public class Defensive implements State {
    public String run_ai () {
        return "is Defensive";
    }

    public State next_state () {
        return new Passive();
    }
}
