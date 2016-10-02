package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FishTest {
    private Taco meat;
    @Before
    public void setUp(){
        Taco taco = new TestTaco ();

        meat = new Fish(taco);
    }

    @Test
    public void testCost(){
        double cost = meat.cost();
        assertEquals(4.0, cost, 0);
    }

    @Test
    public void testDescription(){
        assertEquals("Taco Normal de pescado", meat.getDescription());
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void errorTest () {
        meat.setSize(Taco.MINI);
        meat.cost();
    }

    class TestTaco extends Taco {
        @Override
        public String getDescription() {
            return "Taco Normal";
        }

        @Override
        public double cost() {
            return 1;
        }
    }
}
