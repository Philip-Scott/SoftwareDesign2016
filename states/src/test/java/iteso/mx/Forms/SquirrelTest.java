package iteso.mx.Forms;

import iteso.mx.Squirrel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Felipe on 08/11/2016.
 */
public class SquirrelTest {
    Squirrel squirrel;

    @Before
    public void setup () {
        squirrel = new Squirrel();
    }

    @Test
    public void normal () {
        assertEquals("Squirrel is Passive", squirrel.toString());
    }

    @Test
    public void aggressive () {
        squirrel.set_state(new Aggressive());
        assertEquals("Squirrel is Aggressive", squirrel.toString());
    }

    @Test
    public void defensive () {
        squirrel.set_state(new Defensive());
        assertEquals("Squirrel is Defensive", squirrel.toString());
    }

    @Test
    public void world_domination () {
        squirrel.set_state(new TakingOverTheWorld());
        assertEquals("Squirrel is taking over the world!", squirrel.toString());
    }
}
