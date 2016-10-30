package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.Router;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Linksys implements Router {

    public String on() {
        String out = "";
        out += ("Linksys router is ON");
        return out;
    }

    public String off() {
        String out = "";
        out += ("Linksys router is OFF");
        return out;
    }

    public String checkInternet() {
        String out = "";
        out += ("Checking internet connection");
        out += ("Internet connection is OK");
        return out;
    }
}
