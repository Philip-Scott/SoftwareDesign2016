package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco meat = new Fish(taco);
        when(taco.getSize()).thenReturn(Taco.MEGA);
        when(taco.cost()).thenReturn(8.0);
        double cost = meat.cost();
        assertEquals(14.3, cost,0);
    }

    @Test
    public void testDescription(){
        Taco meat = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = meat.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
}
