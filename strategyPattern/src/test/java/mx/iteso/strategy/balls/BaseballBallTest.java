package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
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
}
