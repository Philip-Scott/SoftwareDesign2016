package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GolfBallTest {

    @Test
    public void testgolfball() {
        GolfBall ball = new GolfBall();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Golf ball: I'm Rolling!", ball.roll());
    }
}
