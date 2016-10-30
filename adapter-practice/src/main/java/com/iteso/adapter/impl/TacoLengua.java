package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLengua implements Taco {

    public String fill() {
        String out = "Take a tortilla and fill it with Lengua";
        System.out.println(out);
        return out;
    }

    public String fold() {
        String out = "Fold the tortilla";
        System.out.println(out);
        return out;
    }

    public String printDescription() {
        String out = "Lengua Taco";
        System.out.println(out);
        return out;
    }
}
