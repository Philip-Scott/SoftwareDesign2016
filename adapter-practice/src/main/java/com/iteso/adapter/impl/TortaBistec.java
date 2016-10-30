package com.iteso.adapter.impl;

import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaBistec implements Torta {
    public String cutByHalf() {
        String out = "Take a bread and cut it by half";
        System.out.println(out);
        return out;
    }

    public String fill() {
        String out = "Take the bottom half and fill it with Bistec";
        System.out.println(out);
        return out;
    }

    public String cover() {
        String out = "Put the top of the bread";
        System.out.println(out);
        return out;
    }

    public String printDescription() {
        String out = "Bistec Torta";
        System.out.println(out);
        return out;
    }
}
