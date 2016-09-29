package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LenguaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco meat = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = meat.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco meat = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = meat.getDescription();
        assertEquals("Taco Normal", desc);
    }
}
