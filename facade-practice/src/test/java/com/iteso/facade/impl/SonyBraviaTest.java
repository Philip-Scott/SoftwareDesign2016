package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.SonyBravia;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class SonyBraviaTest {
    TV sonybravia;
    @Before
    public void setUp(){
        sonybravia = new SonyBravia();
    }
    @Test
    public void SonyBraviaOnTest(){
        String out = "Sony Bravia is ON";
        assertEquals(out,sonybravia.on());
    }
    @Test
    public void SonyBraviaOffTest(){
        String out = "Sony Bravia is OFF";
        assertEquals(out,sonybravia.off());
    }
    @Test
    public void toHDMITest(){
        String out = "Changing Sony Bravia input to HDMI";
        assertEquals(out,sonybravia.toHDMI());
    }
}
