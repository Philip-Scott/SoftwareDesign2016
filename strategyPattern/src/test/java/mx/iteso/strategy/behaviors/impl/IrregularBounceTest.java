package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 9/12/16.
 */
public class IrregularBounceTest {
    @Test
    public void testIrregularBounce() {
        IrregularBounce bounce = new IrregularBounce();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, bounce.bounce());
    }
}
