package mx.iteso.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 10/22/16.
 */

public class DrinkTest {
    Drink drink;

    private String testString = "TestString";
    private float testPrice = 1.0f;

    @Before
    public void setup () {
        drink = new Drink();
    }

    @Test
    public void testName () {
        drink.setName(Consts.testName);
        assertEquals(Consts.testName, drink.getName());
    }

    @Test
    public void testWaiter () {
        drink.setWaiter(Consts.testWaiter);
        assertEquals(Consts.testWaiter, drink.getWaiter());
    }

    @Test
    public void testDescription () {
        drink.setDescription(Consts.testDescription);
        assertEquals(Consts.testDescription, drink.getDescription());
    }

    @Test
    public void testPrice () {
        drink.setPrice(Consts.testPrice);
        assertEquals(Consts.testPrice, drink.getPrice(), 0.1);
    }
}
