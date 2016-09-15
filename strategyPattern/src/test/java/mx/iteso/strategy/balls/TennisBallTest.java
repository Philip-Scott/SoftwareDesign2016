package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NormalRoll;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
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

    @Test
    public void testCustomBall () {
        TennisBall ball = new TennisBall(new Crash(), new NotDeflatable(), new NormalRoll());
        assertEquals(BallsTest.CRASH_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Tennis ball: I'm Rolling!", ball.roll());
    }
}
