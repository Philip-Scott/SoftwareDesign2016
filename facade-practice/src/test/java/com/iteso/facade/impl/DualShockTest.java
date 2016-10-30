package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.DualShock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class DualShockTest {
    GameController dualshock;
    @Before
    public void setUp(){
        dualshock = new DualShock();
    }
    @Test
    public void DualShockOnTest(){
        String out = "DualShock wireless controller is ON";
        assertEquals(out,dualshock.on());
    }
    @Test
    public void DualShockOffTest(){
        String out = "DualShock wireless controller is OFF";
        assertEquals(out,dualshock.off());
    }

}
