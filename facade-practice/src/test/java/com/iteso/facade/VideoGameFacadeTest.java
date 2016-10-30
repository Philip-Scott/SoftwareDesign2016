package com.iteso.facade;
import com.iteso.facade.impl.*;
import com.iteso.facade.impl.impl.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class VideoGameFacadeTest {
    VideoGameFacade videogamefacade;
    GameConsole ps3 = new PS3();
    GameController dualShock = new DualShock();
    Lights lights = new EcoLights();
    Router linksys = new Linksys();
    SoundSystem bose = new Bose();
    TV tv = new SonyBravia();
    @Before
    public void setUp(){
        videogamefacade = new VideoGameFacade(tv, ps3,dualShock,bose,linksys,lights);
    }
    @Test
    public void VideoGameFaceOn(){
        String out = "Sony Bravia is ON\n";
        out += "Changing Sony Bravia input to HDMI\n";
        out += "Play Station 3 is ON\n";
        out += "DualShock wireless controller is ON\n";
        out += "Gears of war has been inserted into Play Station 3\n";
        out += "Bose Surround System is turning ON\n";
        out += "Bose Surround System is ON\n";
        out += "Changing Bose input to Optical\n";
        out += "Linksys router is ON\n";
        out += "Checking internet connectionInternet connection is OK\n";
        out += "EcoLights are OFF\n";
        out += "Setting Online mode on Gears of war\n";
        out += "Playing Gears of war\n";
        assertEquals(out,videogamefacade.playOnlineGame("Gears of war"));
    }
    @Test
    public void VideoGameFaceOff(){
        String out = "EcoLights are ON\n";
        out += "Sony Bravia is OFF\n";
        out += "DualShock wireless controller is OFF\n";
        out += "Play Station 3 is OFF\n";
        out += "Bose Surround System is turning OFF\n";
        out += "Bose Surround System is OFF\n";
        out += "Linksys router is OFF\n";
        assertEquals(out,videogamefacade.stopPlayingGame());
    }
}
