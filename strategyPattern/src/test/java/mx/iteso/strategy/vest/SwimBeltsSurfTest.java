package mx.iteso.strategy.vest;

import mx.iteso.strategy.VestTest;
import mx.iteso.strategy.vests.SwimBeltsSurf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimBeltsSurfTest {
    @Test
    public void testSwimBeltsSurfTest() {
        SwimBeltsSurf swimBeltsSurf = new SwimBeltsSurf();
        assertEquals(VestTest.DEFLATING, swimBeltsSurf.performDeflate());
        assertEquals(VestTest.INFLATING, swimBeltsSurf.performInflate());
        assertEquals(VestTest.LOW_FLOATING, swimBeltsSurf.capacity());
    }
}
