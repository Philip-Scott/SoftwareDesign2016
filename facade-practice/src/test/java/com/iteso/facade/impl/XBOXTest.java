package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.PS3;
import com.iteso.facade.impl.impl.PS3Game;
import com.iteso.facade.impl.impl.XBOX;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 29/10/2016.
 */
public class XBOXTest {
    GameConsole xbox;
    @Before
    public void setUp(){
        xbox = new XBOX();
    }
    @Test
    public void PS3OnTest(){
        String out = "XBOX 360 is ON";
        assertEquals(out,xbox.on());
    }
    @Test
    public void PS3OffTest(){
        String out = "XBOX 360 is OFF";
        assertEquals(out,xbox.off());
    }
    @Test
    public void insertGameTest(){
        VideoGame game;
        game = new PS3Game("Fifa");
        String out = "Fifa" + " has been inserted into XBOX 360";
        assertEquals(out,xbox.insertGame(game));
    }
}
