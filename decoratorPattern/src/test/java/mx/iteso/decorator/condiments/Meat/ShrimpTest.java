package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Shrimp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ShrimpTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco meat = new Shrimp(taco);
        when(taco.getSize()).thenReturn(Taco.MEGA);
        when(taco.cost()).thenReturn(8.0);
        double cost = meat.cost();
        assertEquals(24.8, cost,0);
    }

    @Test
    public void testDescription(){
        Taco meat = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = meat.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }
}
