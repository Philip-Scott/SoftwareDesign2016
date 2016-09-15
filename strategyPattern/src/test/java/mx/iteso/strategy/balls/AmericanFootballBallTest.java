package mx.iteso.strategy.balls;

import mx.iteso.strategy.BallsTest;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalRoll;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
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

    @Test
    public void testCustomBall () {
        AmericanFootballBall ball = new AmericanFootballBall(new Crash(), new NotDeflatable(), new NormalRoll());
        assertEquals(BallsTest.CRASH_BOUNCE, ball.performBounce());
        assertEquals(BallsTest.NOT_DEFLATING, ball.performDeflate());
        assertEquals(BallsTest.NOT_INFLATING, ball.performInflate());
        assertEquals("American Football ball: I'm Rolling!", ball.roll());
    }
}
