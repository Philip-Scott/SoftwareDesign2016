package mx.iteso.strategy.vest;

import mx.iteso.strategy.VestTest;
import mx.iteso.strategy.vests.LifeVestSurf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeVestSurfTest {
    @Test
    public void testLifeVestSurfTest() {
        LifeVestSurf lifeVestSurf = new LifeVestSurf();
        assertEquals(VestTest.DEFLATING, lifeVestSurf.performDeflate());
        assertEquals(VestTest.INFLATING, lifeVestSurf.performInflate());
        assertEquals(VestTest.LOW_FLOATING, lifeVestSurf.capacity());
    }
}
