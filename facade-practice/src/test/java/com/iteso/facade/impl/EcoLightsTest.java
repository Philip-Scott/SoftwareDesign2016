package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.EcoLights;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class EcoLightsTest {
    Lights ecolights;
    @Before
    public void setUp(){
        ecolights = new EcoLights();
    }
    @Test
    public void EcoLightsOnTest(){
        String out = "EcoLights are ON";
        assertEquals(out,ecolights.on());
    }
    @Test
    public void EcoLightsOffTest(){
        String out = "EcoLights are OFF";
        assertEquals(out,ecolights.off());
    }
}
