package com.iteso.facade.impl.impl;

import com.iteso.facade.impl.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class PS3Game implements VideoGame {
    String name;
    public PS3Game(String name){
        this.name = name;
    }

    public String setOnlineMode() {
        String out = "";
        out += ("Setting Online mode on " + name);
        return out;
    }

    public String play() {
        String out = "";
        out += ("Playing " + name);
        return out;
    }

    public String getName() {
        return this.name;
    }
}
