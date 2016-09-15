package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NormalRoll;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 9/12/16.
 */
public class BaseballBallTest {
    @Test
    public void testBaseball() {
        BaseballBall baceball = new BaseballBall();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, baceball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, baceball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, baceball.performInflate());
        assertEquals("Baseball ball: I'm Rolling!", baceball.roll());
    }

    @Test
    public void testCustomBall () {
        BaseballBall ball = new BaseballBall(new Crash(), new NotDeflatable(), new NormalRoll());
        assertEquals(BallsTest.CRASH_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Baseball ball: I'm Rolling!", ball.roll());
    }
}
