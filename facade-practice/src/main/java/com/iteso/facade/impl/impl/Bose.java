package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.SoundSystem;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bose implements SoundSystem {

    public String on() {
        String out = "";
        out += ("Bose Surround System is turning ON\n");
        out += ("Bose Surround System is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("Bose Surround System is turning OFF\n");
        out += ("Bose Surround System is OFF");
        return out;
    }

    public String toOpticalEntry() {
        String out = "";
        out += ("Changing Bose input to Optical");
        return out;
    }
}
