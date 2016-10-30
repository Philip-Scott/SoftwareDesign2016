package com.iteso.facade.impl;
/**
 * Created by Diego on 29/10/2016.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.iteso.facade.impl.impl.*;

public class BoseTest {
    SoundSystem bose;
    @Before
    public void SetUp(){
        bose = new Bose();
    }
    @Test
    public void BoseOnTest(){
        String out = "Bose Surround System is turning ON\n" + "Bose Surround System is ON";
        assertEquals(out,bose.on());
    }
    @Test
    public void BoseOffTest(){
        String out = "Bose Surround System is turning OFF\n" + "Bose Surround System is OFF";
        assertEquals(out,bose.off());
    }
    @Test
    public void toTopicalEntryTest(){
        String out = "Changing Bose input to Optical";
        assertEquals(out,bose.toOpticalEntry());
    }

}
