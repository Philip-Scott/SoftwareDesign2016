package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NormalRoll;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
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

    @Test
    public void testCustomBall () {
        VolleyballBall ball = new VolleyballBall(new Crash(), new NotDeflatable(), new NormalRoll());
        assertEquals(BallsTest.CRASH_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Voleyball ball: I'm Rolling!", ball.roll());
    }
}
