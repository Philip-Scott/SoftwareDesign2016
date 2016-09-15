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
public class SoccerBallTest {

    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall();
        assertEquals(BallsTest.NORMAL_BOUNCE, soccerBall.performBounce());
        assertEquals(BallsTest.DEFLATING, soccerBall.performDeflate());
        assertEquals(BallsTest.INFLATING, soccerBall.performInflate());
        assertEquals("Soccer ball: I'm Rolling!", soccerBall.roll());
    }

    @Test
    public void testCustomBall () {
        SoccerBall ball = new SoccerBall(new Crash(), new NotDeflatable(), new NormalRoll());
        assertEquals(BallsTest.CRASH_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("Soccer ball: I'm Rolling!", ball.roll());
    }
}


