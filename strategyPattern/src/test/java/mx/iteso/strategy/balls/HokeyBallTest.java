package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HokeyBallTest {
    @Test
    public void testHokeyball() {
        HockeyBall ball = new HockeyBall();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Hockey ball: I'm Rolling Oddly!", ball.roll());
    }
}
