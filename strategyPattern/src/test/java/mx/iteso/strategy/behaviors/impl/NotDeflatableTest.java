package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 9/12/16.
 */
public class NotDeflatableTest {
    @Test
    public void testNotDeflatableDeflate() {
        NotDeflatable deflatable = new NotDeflatable();
        assertEquals(BallsTest.NOT_DEFLATING,deflatable.deflate());

    }

    @Test
    public void testNotDeflatableInflate() {
        NotDeflatable deflatable = new NotDeflatable();
        assertEquals(BallsTest.NOT_INFLATING,deflatable.inflate());
    }
}
