package mx.iteso.strategy.vest;

import mx.iteso.strategy.VestTest;
import mx.iteso.strategy.vests.WaterTubesSurf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTubesSurfTest {
    @Test
    public void testWaterTubesSurfTest() {
        WaterTubesSurf waterTubesSurfTest = new WaterTubesSurf();
        assertEquals(VestTest.DEFLATING, waterTubesSurfTest);
        assertEquals(VestTest.INFLATING, waterTubesSurfTest.performInflate());
        assertEquals(VestTest.LOW_FLOATING, waterTubesSurfTest.capacity());
    }
}
