package com.iteso.facade.impl;

import com.iteso.facade.impl.impl.Linksys;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 29/10/2016.
 */
public class LinksysTest {
    Router linksys;
    @Before
    public void setUp(){
        linksys = new Linksys();
    }
    @Test
    public void LinksysOnTest(){
        String out = "Linksys router is ON";
        assertEquals(out,linksys.on());
    }
    @Test
    public void LinksysOffTest(){
        String out = "Linksys router is OFF";
        assertEquals(out,linksys.off());
    }
    @Test
    public void CheckInternetTest(){
        String out = "Checking internet connection" + "Internet connection is OK";
        assertEquals(out,linksys.checkInternet());
    }
}
