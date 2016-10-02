package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco taco = new Quesadilla();
        assertEquals(10.0, taco.cost(),0);
    }
}
