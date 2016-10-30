package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.Lights;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class EcoLights implements Lights {

    public String on() {
        String out = "";
        out += ("EcoLights are ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("EcoLights are OFF");
        return out;
    }
}
