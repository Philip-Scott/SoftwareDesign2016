package mx.iteso.strategy.vest;

import mx.iteso.strategy.VestTest;
import mx.iteso.strategy.vests.LifeSaversCandiesSurf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeSaversCandiesSurfTest {
    @Test
    public void testLifeSaversCandiesSurfTest() {
        LifeSaversCandiesSurf lifeSaversCandiesSurf = new LifeSaversCandiesSurf();
        assertEquals(VestTest.DEFLATING, lifeSaversCandiesSurf.performDeflate());
        assertEquals(VestTest.INFLATING, lifeSaversCandiesSurf.performInflate());
        assertEquals(VestTest.LOW_FLOATING, lifeSaversCandiesSurf.capacity());
    }
}
