package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.GameController;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class DualShock implements GameController {

    public String on() {
        String out = "";
        out += ("DualShock wireless controller is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("DualShock wireless controller is OFF");
        return out;
    }
}
