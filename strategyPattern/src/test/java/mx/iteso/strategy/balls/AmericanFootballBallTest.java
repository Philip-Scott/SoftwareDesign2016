package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericanFootballBallTest {

    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        assertEquals(BallsTest.IRREGULAR_BOUNCE, americanFootballBall.performBounce());
        assertEquals(BallsTest.DEFLATING, americanFootballBall.performDeflate());
        assertEquals(BallsTest.INFLATING, americanFootballBall.performInflate());
        assertEquals("American Football ball: I'm Rolling Oddly!", americanFootballBall.roll());
    }
}
