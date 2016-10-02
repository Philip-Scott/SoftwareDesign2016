package mx.iteso.decorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


/**
 * Created by felipe on 10/1/16.
 */
public class TacoTest {
    Taco taco;

    @Before
    public void setup () {
        taco = new TestTaco ();
    }

    @Test
    public void stringTest () {
        taco.setSize(Taco.REGULAR);
        assertEquals("Any Taco", taco.getDescription());
        taco.setSize(Taco.MEGA);
        assertEquals("MEGAAny Taco", taco.getDescription());
        taco.setSize(Taco.MINI);
        assertEquals("mini Any Taco", taco.getDescription());
    }

    class TestTaco extends Taco {
        @Override
        public double cost() {
            return 1;
        }
    }
}
