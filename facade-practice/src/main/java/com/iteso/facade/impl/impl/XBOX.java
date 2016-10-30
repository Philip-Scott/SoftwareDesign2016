package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.GameConsole;
import com.iteso.facade.impl.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class XBOX implements GameConsole {

    public String on() {
        String out = "";
        out += ("XBOX 360 is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("XBOX 360 is OFF");
        return out;
    }

    public String insertGame(VideoGame videoGame) {
        String out = "";
        out += (videoGame.getName() + " has been inserted into XBOX 360");
        return out;
    }
}
