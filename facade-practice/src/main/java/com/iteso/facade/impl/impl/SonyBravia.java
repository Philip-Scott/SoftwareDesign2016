package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.TV;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SonyBravia implements TV {

    public String on() {
        String out = "";
        out += ("Sony Bravia is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("Sony Bravia is OFF");
        return out;
    }

    public String toHDMI() {
        String out = "";
        out += ("Changing Sony Bravia input to HDMI");
        return out;
    }
}
