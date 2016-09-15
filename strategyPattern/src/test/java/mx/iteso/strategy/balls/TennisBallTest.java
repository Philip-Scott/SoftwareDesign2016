package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TennisBallTest {
    @Test
    public void testTennisBall() {
        TennisBall ball = new TennisBall();
        assertEquals(BallsTest.NORMAL_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Tennis ball: I'm Rolling!", ball.roll());
    }
}
