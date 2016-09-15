package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PoolBallTets {
    @Test
    public void testPoolball() {
        PoolBall ball = new PoolBall();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Pool ball: I'm Rolling!", ball.roll());
    }
}
