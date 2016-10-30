package com.iteso.facade.impl;
import com.iteso.facade.impl.impl.PS3Game;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class PS3GameTest {
    VideoGame ps3Game;
    @Before
    public void setUp(){
        String game = "Fifa";
        ps3Game = new PS3Game(game);
    }
    @Test
    public void setOnlineModeTest(){
        String out = "Setting Online mode on Fifa";
        assertEquals(out,ps3Game.setOnlineMode());
    }
    @Test
    public void PlayTest(){
        String out = "Playing Fifa";
        assertEquals(out,ps3Game.play());
    }
    @Test
    public void GetNameTest(){
        String out = "Fifa";
        assertEquals(out,ps3Game.getName());
    }
}
