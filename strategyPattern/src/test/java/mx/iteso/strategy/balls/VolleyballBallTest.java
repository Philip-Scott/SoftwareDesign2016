package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VolleyballBallTest {
    @Test
    public void testVolleyball() {
        VolleyballBall ball = new VolleyballBall();
        assertEquals(BallsTest.NORMAL_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.INFLATING, ball.performInflate());
        assertEquals("Voleyball ball: I'm Rolling!", ball.roll());
    }
}
