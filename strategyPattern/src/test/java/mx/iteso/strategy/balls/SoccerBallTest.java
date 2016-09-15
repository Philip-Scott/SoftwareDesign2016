package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
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
}


