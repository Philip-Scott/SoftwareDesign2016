package iteso.mx.Forms;

import iteso.mx.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Felipe on 08/11/2016.
 */
public class SquirrelTest {
    Squirrel original;
    Animal clone;

    @Before
    public void setup () {
        original = new Squirrel();
        clone = (Animal) original.clone();
    }

    @Test
    public void testDifference () {
        assertEquals(original.toString(), clone.toString());

        clone.form = "Cloned";
        assertEquals(false, original.toString() == clone.toString());
    }

    @Test
    public void testLocation () {
        assertEquals(false, System.identityHashCode(original) == System.identityHashCode(clone));
    }
}
