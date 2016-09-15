package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.BallsTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 9/14/16.
 */
public class RollTest {
    @Test
    public void normall() {
        NormalRoll roll = new NormalRoll();
        assertEquals(BallsTest.NORMAL_ROLL, roll.Roll());

    }

    @Test
    public void odd () {
        IrregularRoll roll = new IrregularRoll();
        assertEquals(BallsTest.IRREGULAR_ROLL, roll.Roll());
    }
}