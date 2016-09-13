package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 9/12/16.
 */
public class NormalBounceTest {
    @Test
    public void testNormalBounce() {
        NormalBounce bounce = new NormalBounce();
        assertEquals(BallsTest.NORMAL_BOUNCE, bounce.bounce());
    }
}
