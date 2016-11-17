package iteso.mx;

import iteso.mx.Forms.State;

/**
 * Created by Diego on 11/17/16.
 */
public abstract class Animal {
    private State state;
    public String form;

    public String toString () {
        return form + " " + state.run_ai();
    }

    public void set_state (State state) {
        this.state = state;
    }
}
