package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrashTest {
    @Test
    public void testCrashBounce() {
        Crash crash = new Crash();
        assertEquals(BallsTest.CRASH_BOUNCE, crash.bounce());
    }
}
