package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.PS3;
import com.iteso.facade.impl.impl.PS3Game;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class PS3Test {
    GameConsole ps3;
    @Before
    public void setUp(){
        ps3 = new PS3();
    }
    @Test
    public void PS3OnTest(){
        String out = "Play Station 3 is ON";
        assertEquals(out,ps3.on());
    }
    @Test
    public void PS3OffTest(){
        String out = "Play Station 3 is OFF";
        assertEquals(out,ps3.off());
    }
    @Test
    public void insertGameTest(){
        VideoGame game;
        game = new PS3Game("Fifa");
        String out = "Fifa" + " has been inserted into Play Station 3";
        assertEquals(out,ps3.insertGame(game));
    }
}
