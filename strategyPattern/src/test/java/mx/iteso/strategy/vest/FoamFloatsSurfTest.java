package mx.iteso.strategy.vest;
import mx.iteso.strategy.VestTest;
import mx.iteso.strategy.vests.FoamFloatsSurf;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FoamFloatsSurfTest {
    @Test
    public void testFoamFloatsSurfTest() {
        FoamFloatsSurf foamFloatsSurf = new FoamFloatsSurf();
        assertEquals(VestTest.DEFLATING, foamFloatsSurf.performDeflate());
        assertEquals(VestTest.INFLATING, foamFloatsSurf.performInflate());
        assertEquals(VestTest.LOW_FLOATING, foamFloatsSurf.capacity());
    }
}
