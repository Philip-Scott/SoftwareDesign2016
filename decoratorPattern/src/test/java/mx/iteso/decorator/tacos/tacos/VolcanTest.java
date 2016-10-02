package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 10/1/16.
 */
public class VolcanTest {

    @Test
    public void testCost() {
        Taco taco = new Volcan();
        assertEquals(12.0, taco.cost(),0);
    }

    @Test
    //Should be the same since the size didn't acually change
    public void testSize() {
        Taco taco = new Volcan();
        assertEquals(12.0, taco.cost(),0);
        taco.setSize(Taco.MEGA);
        assertEquals(12.0, taco.cost(),0);
        taco.setSize(Taco.MINI);
        assertEquals(12.0, taco.cost(),0);
        taco.setSize(Taco.REGULAR);
        assertEquals(12.0, taco.cost(),0);
    }
}
