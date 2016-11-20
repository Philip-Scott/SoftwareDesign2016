package iteso.mx;
import iteso.mx.Animal;
import iteso.mx.Forms.Passive;

/**
 * Created by Diego on 11/17/16.
 */
public class Squirrel extends Animal {
    public Squirrel() {
        form = "Squirrel";
        set_state(new Passive());
    }
}
