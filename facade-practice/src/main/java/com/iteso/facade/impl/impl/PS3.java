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
public class PS3 implements GameConsole {

    public String on() {
        String out = "";
        out += ("Play Station 3 is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("Play Station 3 is OFF");
        return out;
    }

    public String insertGame(VideoGame videoGame) {
        String out = "";;
        out += (videoGame.getName() + " has been inserted into Play Station 3");
        return out;
    }
}
