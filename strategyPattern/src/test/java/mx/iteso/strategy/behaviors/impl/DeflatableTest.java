package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflatableTest {
    @Test
    public void testDeflatableDeflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals(BallsTest.DEFLATING,deflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals(BallsTest.INFLATING,deflatable.inflate());
    }
}
