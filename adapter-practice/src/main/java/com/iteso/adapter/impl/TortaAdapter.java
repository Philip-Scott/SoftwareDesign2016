package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaAdapter implements Taco{
    Torta torta;

    public TortaAdapter(Torta torta){
        this.torta = torta;
    }


    public String fill() {
        return torta.cutByHalf() + torta.fill();
    }


    public String fold() {
        return torta.cover();
    }


    public String printDescription() {
        return torta.printDescription();
    }
}
